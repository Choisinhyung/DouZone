package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;


import dbConn.util.CloseHelper;
import dbConn.util.GiftConnectionHelper;
import model.GiftVO;
import oracle.jdbc.OracleConnection.CommitOption;

public class GiftController { // controller
	
	// 데이터에 관한 모든 것 : 연결, 삽입, 삭제, 수정, 검색
	
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	//connect
	public static void connect() {
		try {
			conn = GiftConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//menu
	public static void menu() throws SQLException { // 예외 위임
		GiftVO vo = new GiftVO(); // 인스턴스 생성
		while(true) {
			System.out.print("\t 0. rollback  ");
			System.out.print("\t 9. commit  ");
			GiftConnectionHelper.menu();
			
			switch (sc.nextInt()) {
				case 0: 
					System.out.println("Commit 하시겠습니까? (Y/N)");
					System.out.println("안하시려면 Rollback 됩니다. ");
					if(sc.next().equalsIgnoreCase("Y")) {
						conn.commit(); // 예외 발생
						selectAll(vo.getClassName()); // => selectAll 메서드로~
						
					} else {
						conn.rollback();
						selectAll(vo.getClassName());
					}
					break;
					
				case 1:
					insert();
					selectAll(vo.getClassName());
					break;
				case 2:
					selectAll(vo.getClassName());
					update(vo.getClassName());
					selectAll(vo.getClassName());
					break;
				case 3:
					selectAll(vo.getClassName());
					break;
				case 4:
					selectByGno(vo.getClassName());
					break;
				case 5:
					selectAll(vo.getClassName());
					delete(vo.getClassName());
					break;
				case 6:
					System.out.println("프로그램을 종료합니다. ");
					System.exit(0);
					break;
				case 9:
					commit();
					break;
				default:
					System.out.println("없는 번호를 선택하셨습니다. 0 ~ 6, 9번 중에서 선택하세요. ");
					break;
			} // end switch
		} // end while
	} // end menu()
	


	//delete
	private static void delete(String className) throws SQLException {
		System.out.println("delete recode number gno = ");
		String gno = sc.next();
		try {
			pstmt = conn.prepareStatement("DELETE " + className + " WHERE gno = ?");
			pstmt.setString(1, gno);
			int result = pstmt.executeUpdate(); // 쿼리 실행
			
			System.out.println("정말 삭제하시겠습니까? (Y/N)");
			if(sc.next().equalsIgnoreCase("Y")) {
				conn.commit();
				System.out.println(result + " 개의 데이터가 삭제 되었습니다. ");				
			} else {
				conn.rollback();
				System.out.println("rollback 되었습니다. ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//select ~ where : 조건 검색
	private static void selectByGno(String className) throws SQLException {
		System.out.println("검색을 원하는 상품번호를 입력하세요. ");
		pstmt = conn.prepareStatement("SELECT * FROM "+ className + " WHERE GNO = ?"); //예외발생
		pstmt.setInt(1, sc.nextInt());
		rs = pstmt.executeQuery(); // 반환값있는경우
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		
		while(rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기
				
				switch (rsmd.getColumnType(i)) {
					case Types.NUMERIC:
					case Types.INTEGER:
						System.out.println(rsmd.getColumnClassName(i) + " : " + rs.getInt(i));
					break;
					case Types.FLOAT:
						System.out.println(rsmd.getColumnClassName(i) + " : " + rs.getFloat(i));
						break;
					case Types.DOUBLE:
						System.out.println(rsmd.getColumnClassName(i) + " : " + rs.getDouble(i));
						break;
					case Types.CHAR:
						System.out.println(rsmd.getColumnClassName(i) + " : " + rs.getString(i));
						break;
					case Types.DATE:
						System.out.println(rsmd.getColumnClassName(i) + " : " + rs.getDate(i));
						break;
					default:						
						System.out.println(rsmd.getColumnClassName(i) + " : " + rs.getString(i));
					break;
				} // end switch
			} // end for
			System.out.println();
		} // end while
	}// end selectByGno
	
	//rollback
	public static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("rollback success!!!");
	}
	
	//commit
	public static void commit() throws SQLException {
		conn.commit();
		System.out.println("commit success!!!");
	}
	
	//update
	private static void update(String className) throws SQLException {
		a: // 식별자
		while (true) {
			selectAll(className);
			String modify = null;
			
			System.out.println("0 선택 => update 탈출합니다.");
			System.out.print("\n\n수정할 GNO : ");
			int gno = sc.nextInt();
			
			b:
			while(true) {
				System.out.println("\n\n1. GNO\t2. GNAME\t3. G_START\t4. G_END\t0. exit");
				System.out.println("수정할 필드 : ");
				int choice = sc.nextInt();
				
				switch (choice) {
					case 1:
						System.out.print("바뀔 GNO");
						stmt.execute("UPDATE " + className + " SET gno = '" + sc.nextInt() + "' WHERE gno = " + gno);
						break b;
					case 2:
						System.out.print("바뀔 GNAME");
						stmt.execute("UPDATE " + className + " SET gname = " + sc.next() + " WHERE gno = " + gno);
						break b;
					case 3:
						System.out.print("바뀔 G_START");
						stmt.execute("UPDATE " + className + " SET g_start = " + sc.nextInt() + " WHERE gno = " + gno);
						break b;
					case 4:
						System.out.print("바뀔 G_END");
						stmt.execute("UPDATE " + className + " SET g_end = " + sc.nextInt() + " WHERE gno = " + gno);
						break b;
					case 0 : break a;
					default : 
						System.out.println("잘못된 번호입니다. ");
						break;
				} // end switch
				
				switch (choice) {
					case 1: modify = "GNO";
					case 2: modify = "GNAME";
					case 3: modify = "G_START";
					case 4: modify = "G_END";
					break;
				} // end switch
				System.out.println(modify + " 수정이 완료되었습니다. ");
			} // end in while
		} // end out while
		
	}
	
	//insert
	public static void insert() throws SQLException {
		System.out.println("추가를 원하는 상품번호를 입력하세요. ");
		String gno = sc.next();
		System.out.println("상품이름을 입력하세요. ");
		String gname = sc.next();
		System.out.println("최소값을 입력하세요. ");
		String g_start = sc.next();
		System.out.println("최대값을 입력하세요. ");
		String g_end = sc.next();
		pstmt = conn.prepareStatement("INSERT INTO gift VALUES(?, ?, ?, ?)"); //예외발생
		pstmt.setNString(1, gno);
		pstmt.setNString(2, gname);
		pstmt.setNString(3, g_start);
		pstmt.setNString(4, g_end);
		int result = pstmt.executeUpdate(); // 반환값있는경우
		System.out.println(result + "개의 데이터 추가가 완료되었습니다. ");
		
	}
	//selectAll
	public static void selectAll(String className) throws SQLException{
		rs = stmt.executeQuery("select * from " + className);
	     
	    ResultSetMetaData rsmd = rs.getMetaData();
	    int count = rsmd.getColumnCount();
	    
	    while ( rs.next()) {
	       for( int i = 1; i <= count; i ++) { // 각 타입별로 출력하기
	          
	          switch(rsmd.getColumnType(i)) {
	          case Types.NUMERIC:
	          case Types.INTEGER:
	             System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " \t");
	             break;
	          case Types.FLOAT:
	             System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " \t");
	             break;
	          case Types.DOUBLE:
	             System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " \t");
	             break;
	          case Types.CHAR:
	             System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " \t");
	             break;
	          case Types.DATE:
	             System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " \t");
	             break;
	          default:
	             System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " \t");
	             break;
	          } // switch end
	       }// end for
	       System.out.println();
	    }//end while
	}
}