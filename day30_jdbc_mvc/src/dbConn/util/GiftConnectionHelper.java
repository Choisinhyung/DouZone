package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class GiftConnectionHelper {
	
	/*
	 * DB 연결 정보 반복적으로 코딩 해결
	 * 다른 클래스에서 아래 코드 구현을 하지 않도록 설계
	 * Class.forName("oracle.jdbc.OracleDriver");
	 * String url = "jdbc:oracle:thin:@192.168.110.33:1521:ord";
	 * String uid = "sinhyung";
	 * String pwd = "oracle";
	 * Connection con = DriverManager.getConnection(url, uid, pwd);
	 * 
	 * 이런식으로 사용
	 * ConnectionHelper.getConnection("mysql") or ("oracle"),.......
     * dsn ==> data source name
	 * 
	 */	
	public static Connection getConnection(String dsn) {
		// 함수(접근자 : public, static)
		Connection conn = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:ord";
		String uid = "sinhyung";
		String pwd = "oracle";
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("com.mysql.jdbc.Driver", uid, pwd);
			} else if(dsn.equals("oracle")) {
				conn = DriverManager.getConnection(url, uid, pwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("\n-=-=-=-=-= JDBC Query =-=-=-=-=-");
		System.out.println("\t 0. Rollback ");
		System.out.println("\t 1. 레코드 삽입(추가) ");
		System.out.println("\t 2. 레코드 수정 ");
		System.out.println("\t 3. 전체보기 ");
		System.out.println("\t 4. 조건 검색(ex > gno) ");
		System.out.println("\t 5. 레코드 삭제 ");
		System.out.println("\t 6. 프로그램 종료 ");
		System.out.println("\t 9. Commit ");		
		System.out.println("\t >> 원하는 메뉴를 선택해주세요.");
		System.out.println();
		}
	}
