package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// gno로 수정하기 - update
		
	    Class.forName("oracle.jdbc.OracleDriver");
	    System.out.println("Driver load success !!");
	      
		String url = "jdbc:oracle:thin:@192.168.110.33:1521:ord";
		String uid = "sinhyung";
		String pwd = "oracle";
	      
	    Connection conn = DriverManager.getConnection(url, uid, pwd);
	    System.out.println("Connection success!!");
	      
		String sql = "update gift set gname = '삼성노트북' where gno = 7";
		Statement stmt = conn.prepareStatement(sql);	

		
		int result = stmt.executeUpdate(sql); // 명령 실행
		System.out.println(result + "개 데이터 수정을 성공했습니다. ");
		
		stmt.close();
		conn.close();

	}

}
