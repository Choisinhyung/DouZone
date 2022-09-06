package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load ... exception
		Class.forName("oracle.jdbc.OracleDriver"); // 예외발생
		
		// 2. Connection & Open
		String url = "jdbc:oracle:thin:@192.168.110.33:1521:ord";
		String uid = "sinhyung";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd); // 예외발생

		// 3. 사용 (DML 명령어)
		Statement stmt = conn.createStatement();
		//"insert into gift values(11, '종합과자', 1000, 20000)";
		String sql = "insert into gift values(12, '스팸2', 3000, 5000)";
		int result = stmt.executeUpdate(sql); // 명령 실행
		System.out.println(result + "개 데이터 추가를 성공했습니다. ");
		
		// 4.닫기 (자원 반환)
		stmt.close();
		conn.close();

	}

}