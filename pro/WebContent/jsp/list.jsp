<%@ page import="java.sql.*" %>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">


<title>Index</title>
<link rel="stylesheet" type="text/css" href="../css/main.css" >
<%
try {
	String driverName ="oracle.jdbc.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:orcl";
	ResultSet rs =null;
	Class.forName(driverName);
	Connection con= DriverManager.getConnection(url,"system","oracle");
	Statement stmt =con.createStatement();
	String sql ="SELECT * FROM BOARD ORDER BY IDX DESC";
	rs= stmt.executeQuery(sql);
	
	%>

</head>
<body>
<h1> 댓글 게시판</h1>  
  <table  >
  <colgroup>

<col class="hi" width="100"  > 
<col class="hi" width="100"> 
<col class="hi" width="100"> 
<col class="hello" width="1000"> 

</colgroup>
  
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>댓글내용</th>
    
  </tr>
  <% 
  while(rs.next()){
	  out.print("<tr>");
	  request.setCharacterEncoding("utf-8");
	  out.print("<td ><h3>" + rs.getString(1)+"</h3></td>");
	  out.print("<td><h3>" + rs.getString(2)+"</h3></td>");
	  out.print("<td><h3>" + rs.getString(3)+"</h3></td>");
	  out.print("<td><h3>" + rs.getString(4)+"</h3></td>");
	  out.print("</tr>");
  }
  %>

  </table>
  <a href="write.jsp"><button type='button' class='inputBtn' id='inputBtn'>글쓰기</button></a>
 <br>
 
  <%
	con.close();
} catch (Exception e) {
	out.println("list 접속오류");
	e.printStackTrace();
} 

  %>
  
</body>
</html>