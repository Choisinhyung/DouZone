<%@ page import="java.sql.*" %>


<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Insert title here</title>
</head>
<%
int idx=1;
String title =request.getParameter("title");
String writer =request.getParameter("writer");
String content =request.getParameter("content");

try {
	String driverName ="oracle.jdbc.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:orcl";
	Class.forName(driverName);
	Connection con= DriverManager.getConnection(url,"system","oracle");
	out.println("db접속 성공");
	Statement stmt =con.createStatement();
	String sql ="INSERT INTO BOARD"+ "(IDX,TITLE,WRITER,CONTENT)"+ " VALUES(BOARD_SEQ.NEXTVAL,'"+title+"','"+writer+"','"+content+"')";
	stmt.executeUpdate(sql);
	con.close();
} catch (Exception e) {
	out.println("접속오류");
	e.printStackTrace();
} finally{
	out.print("<script>location.href='list.jsp';</script>");
}

%>
<body>

</body>
</html>