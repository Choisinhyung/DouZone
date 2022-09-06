package ex02.jdbc;

// import java.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {

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
		Connection conn = DriverManager.getConnection(url, uid, pwd); // 예외발생
		System.out.println("Connection 성공!");
		
		// 3. 사용 (DML 명령어)
		Statement stmt = conn.createStatement();
		//반환값 없는 경우에는 아래코드 사용안함(executeQuery)
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // ctrl+shift+x
		
		System.out.println("상품번호  상품명  최저가  최고가");
		
		while (rs.next()) {
			int gno = rs.getInt(1); // 인덱스번호 int gno = rs.getInt("gno");
			String gname = rs.getString(2); // 필드명도 가능
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end
		
		// 4. close(); => 자원 반환
		rs.close();
		stmt.close();
		conn.close();

	}
	
	//SQL, Tag는 자바에서 문자열 취급한다.

}
