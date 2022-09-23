<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>댓글 페이지</title>
<link rel="stylesheet" type="text/css" href="../css/main.css" >
<script>
function formChecK(){
	var title =document.forms[0].title.value;
	var writer =document.forms[0].writer.value;
	var content =document.forms[0].content.value;
	
}
<br>


</script>
</head>
<body>
<form action="insert.jsp" method="post" onsubmit="return formCheck();">
<div class="border">
<h1> 댓글 작성</h1>

<h2 align="left"> &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  &nbsp;제목: &nbsp; &nbsp;  &nbsp;<font color="black"><input type ="text" name = "title" required ></font></h2>
<h2 align="left"> &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  &nbsp;작성자: &nbsp;<font color="white"><input type ="text" name = "writer" required></font></h2><br/>
<h2 align="left"> &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  &nbsp;댓글 내용:</h2>
<textarea rows="10" cols="50" name="content"required></textarea><br/>
</div>



<input type="submit" value="등록" type= "button" class='inputBtn' id='inputBtn' >
</form>
 
</body>
</html>