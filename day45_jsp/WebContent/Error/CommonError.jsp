<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <!-- error  page 로 사용할 페이지에는 기재 되어 있어야함 -->
<%@ page isErrorPage="true" %>

<!DOCTYPE>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공통 에러 처리 페이지</title>
</head>
<body>
<h2>
	에러가 발생했습니다 ......페이지 이동합니다
	<p>
		에러타입 : <%= exception.getClass().getName() %>
		<br>
		에러메시지 : <%= exception.getMessage() %>
	
	</p>
</h2>
</body>
</html>