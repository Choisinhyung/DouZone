<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 창</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8"); // euc-kr
	String name = request.getParameter("name");
	String password = request.getParameter("pwd");
	
	out.print(name + " 님 반갑습니다. 비번은 : " + password );
%>
</body>
</html>