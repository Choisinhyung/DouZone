package ex01.jdbc;

// import java.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {

	public static void main(String[] args) throws ClassNotFoundException, SQLException { // 예외위임
		// 1. Driver load ... exception
		//연결안한상태로~
//		Class.forName("oracle.jdbc.driver.OracleDriver"); //
		Class.forName("oracle.jdbc.OracleDriver"); // 예외발생
		System.out.println("driver load success!!!");
		
		// 2. Connection & Open
					  // driver:@IP:portNumber:SID(or 전역데이터베이스명)
//		String url = "jdbc:oracle:thin:@localhost:1521:ord";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:ord";
		String url = "jdbc:oracle:thin:@192.168.110.33:1521:ord";
		String uid = "sinhyung";
		String pwd = "oracle";
		Connection con = DriverManager.getConnection(url, uid, pwd); // 예외발생
		System.out.println("Connection 성공!");
		
		// 3. 사용 (DML 명령어)
		
		// 4. close(); => 자원 반환

	}
	
	//SQL, Tag는 자바에서 문자열 취급한다.

}
