<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="e" class="edu.kosa.ex13.Emp"/>   
<jsp:setProperty property="name" name="e"  value="강감찬" />
<jsp:setProperty property="pay" name="e"  value="6000" />
<jsp:setProperty property="empno" name="e"  value="8877" />

<h2><%= e.toString() %></h2><hr>
<jsp:setProperty property="*" name="e"/>
이름 : <jsp:getProperty property="name"  name="e" /> <br>
사번 : <jsp:getProperty property="empno"  name="e" /> <br>
급여 : <jsp:getProperty property="pay"  name="e" /> <br>


<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>ex14_useBean.jsp  useBean Login</title>
</head>
<body>
<h1>useBean Login</h1>
</body>
</html>