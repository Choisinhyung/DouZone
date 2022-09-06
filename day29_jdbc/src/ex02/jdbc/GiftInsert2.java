package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert2 {
   public static void main(String[] args)  throws ClassNotFoundException, SQLException{
      //1. Driver load ..... exception
//      Class.forName("oracle.jdbc.driver.OracleDriver");
      Class.forName("oracle.jdbc.OracleDriver");
      System.out.println("Driver load success !!");
      
      //2. Connection & Open
                  //driver:@IP:portNumber:SID(or 전역데이터베이스명)
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; // oracle port number 1521
      String uid = "jmg";
      String pwd = "oracle";
      
      Connection conn = DriverManager.getConnection(url, uid, pwd);
      System.out.println("Connection success!!");
      
      //3. 사용 (DML 명령어-INSERT)
      String sql = "insert into gift values (?, ?, ?, ?)";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, 20);
      pstmt.setString(2, "초코렛");
      pstmt.setInt(3, 200);
      pstmt.setInt(4, 3000);

      //pstmt.executeUpdate();   // 반환값이 없는 경우 - insert, update, delete
      int result = pstmt.executeUpdate();
      System.out.println(result+" 개 데이터 추가 성공");
      
    //4. 닫기(자원 반환)
      pstmt.close();
      conn.close();
   }
}