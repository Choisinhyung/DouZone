package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * connectionHelper 클래스의 문제
 * 매번 드라이버 로드
 * connection 생성
 * 
 * 어차피 하나의 프로세스에서 하나만 만들어서 재사용하면 될텐데..
 * => 해결 방법은 공유 자원을 사용하자 : singleton
 * 
 * */


public class ConnectionSingletonHelper {
	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원 (static)
	
	private static Connection conn;
	
	private ConnectionSingletonHelper() {	}
	
	public static Connection getConnection(String dsn) {
		
//		Connection conn = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:ord";
		String uid = "sinhyung";
		String pwd = "oracle";
		
		if( conn != null) {
			return conn; // 재사용한다는 뜻
		}
		
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
	
	public static void close() throws SQLException {
		if(conn != null ) {
			if( !conn.isClosed()) {
				conn.close();
			}
			
		}
	}
}
