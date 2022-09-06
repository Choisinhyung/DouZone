package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DeptConnectionHelper {
	
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
			System.out.println("-------- DEPT QUERY --------");
			System.out.println("\t 1. Commit / Rollback ");
			System.out.println("\t 2. 레코드 전체보기 ");
			System.out.println("\t 3. 레코드 삽입(추가) ");
			System.out.println("\t 4. 레코드 수정 ");
			System.out.println("\t 5. 레코드 삭제 ");
			System.out.println("\t 6. 조건 검색(deptNo) ");
			System.out.println("\t 9. 프로그램 종료 ");		
			System.out.println("\t => 원하는 메뉴를 선택해주세요.");
			System.out.println();
			}
}
