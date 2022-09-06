package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.DeptConnectionHelper;
import model.DeptVO;

public class DeptController {
	/*
	 * 	private int deptNo;
		private String dName;
		private String Loc;
	 */
	
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	//connect
	public static void connect() {
		try {
			conn = DeptConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//menu
	public static void menu() throws SQLException { // 예외 위임
		DeptVO vo = new DeptVO(); // 인스턴스 생성
		while(true) {
			DeptConnectionHelper.menu();
			
			switch (sc.nextInt()) {
				case 1: 
					System.out.println("Commit 하시겠습니까? (Y/N)");
					System.out.println("N을 입력하시면 Rollback 됩니다. ");
					if(sc.next().equalsIgnoreCase("Y")) {
						conn.commit(); // 예외 발생
						selectAll(vo.getClassName()); // => selectAll 메서드로~
						
					} else {
						conn.rollback();
						selectAll(vo.getClassName());
					}
					break;
					
				case 2:
					selectAll(vo.getClassName());
					break;
				case 3:
					selectAll(vo.getClassName());
					insert();
					selectAll(vo.getClassName());
					break;
				case 4:
					selectAll(vo.getClassName());
					update(vo.getClassName());
					break;
				case 5:
					selectByGno(vo.getClassName());
					delete(vo.getClassName());
					break;
				case 6:
					selectAll(vo.getClassName());
					selectByGno(vo.getClassName());
					break;
				case 9:
					System.out.println("프로그램을 종료하시겠습니까? (Y/N)");
					if(sc.next().equalsIgnoreCase("Y")) {
						conn.commit(); // 예외 발생
						System.exit(0);
						
					} else {
						conn.rollback();
						selectAll(vo.getClassName());
					}
					break;
				default:
					System.out.println("없는 번호를 선택하셨습니다. 1 ~ 6, 9번 중에서 선택하세요. ");
					break;
			} // end switch
		} // end while
	} // end menu()
	
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
	
	//insert
	public static void insert() throws SQLException {
		System.out.println("추가를 원하는 번호를 입력하세요. ");
		String deptNo = sc.next();
		System.out.println("이름을 입력하세요. ");
		String dName = sc.next();
		System.out.println("지역을 입력하세요. ");
		String Loc = sc.next();

		pstmt = conn.prepareStatement("INSERT INTO Dept VALUES(?, ?, ?)"); //예외발생
		pstmt.setNString(1, deptNo);
		pstmt.setNString(2, dName);
		pstmt.setNString(3, Loc);
		int result = pstmt.executeUpdate(); // 반환값있는경우
		System.out.println(result + "개의 데이터 추가가 완료되었습니다. ");
		
	}
	
	//update
	private static void update(String className) throws SQLException {
		a: // 식별자
		while (true) {
			selectAll(className);
			String modify = null;
			
			System.out.println("0을 입력하시면 초기화면으로 돌아갑니다. ");
			System.out.print("수정할 번호를 입력하세요 : ");
			int deptNo = sc.nextInt();
			
			b:
			while(true) {
				System.out.println("\n\n1. deptNo\t2. dName\t3. Loc\t0. exit");
				System.out.print("수정할 필드의 번호를 입력해주세요 : ");
				int choice = sc.nextInt();
				
				switch (choice) {
					case 1:
						System.out.print("수정될 deptNo");
						stmt.execute("UPDATE " + className + " SET deptno= " + sc.nextInt() + " WHERE deptNo = " + deptNo);
						break b;
					case 2:
						System.out.print("바뀔 dName");
						stmt.execute("UPDATE " + className + " SET dName = '" + sc.next() + "' WHERE deptNo = " + deptNo);
						break b;
					case 3:
						System.out.print("바뀔 Loc");
						stmt.execute("UPDATE " + className + " SET loc = '" + sc.next() + "' WHERE deptNo = " + deptNo);
						break b;
					case 0 : break a;
					default : 
						System.out.println("잘못된 번호입니다. ");
						break;
				} // end switch
				
				switch (choice) {
					case 1: modify = "deptNo";
					case 2: modify = "dName";
					case 3: modify = "Loc";
					break;
				} // end switch
				System.out.println(modify + " 수정이 완료되었습니다. ");
			} // end in while
		} // end out while
		
	}
	
	//delete
	private static void delete(String className) throws SQLException {
		System.out.println("delete recode number deptNo = ");
		String deptNo = sc.next();
		try {
			pstmt = conn.prepareStatement("DELETE " + className + " WHERE deptno = ?");
			pstmt.setString(1, deptNo);
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
		System.out.println("검색을 원하는 번호를 입력하세요. ");
		pstmt = conn.prepareStatement("SELECT * FROM "+ className + " WHERE deptno = ?"); //예외발생
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
	
	
	
}
