package ex01.jdbc;

import java.sql.*;
import dbConn.util.*; //

public class MainEntry {

	public static void main(String[] args) {
		Connection conn = GiftConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			conn.setAutoCommit(false)
			stmt = conn.createStatement();
			//sql구문 html tag는 java/jsp/servlet 에서 문자열 취급한다.
			String sql = "CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)";
			System.out.println(sql.toString());
			stmt.executeUpdate(sql); // 반환값이 없는 경우
			
			sql = "insert into kosaDB values('aa', 33)";
			int result = stmt.executeUpdate(sql);
			
			sql = "select * from kosaDB";
			rs = stmt.executeQuery(sql); // 반환값이 있는 경우
			
			System.out.println(result + "개 추가됨");
			
			while(rs.next()) {
				System.out.println("name : " + rs.getString(1));
				System.out.println("age : " + rs.getInt("age"));
			}
			
//			conn.commit();
			
//			sql = "drop table kosaDB";
//			result = stmt.executeUpdate(sql);
//			System.out.println("drop table : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(conn);
			
		} // end try
	}
}
