
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="edu.kosa.ex13.Emp"%> 
   
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex13_useBean.jsp</title>
</head>
<body>
<%
	/* 자바에서 객체 생성 방법 */
	Emp e = new Emp();
	out.print(e.toString()+"<hr>");
%>

</body>
</html>