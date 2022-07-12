<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rRequest test page</title>
</head>
<body>
	<h1> Exam of Client Information to Server</h1>
	
	<!-- GET 방식으로 정보 전달 -->
	<a href="./RequestWebInfo.jsp?id=Hello&pw=hi"> Get 방식으로 전달</a>
	<br><br>
	
	<!-- POST 방식으로 정보를 전달 -->
	<form name="testform" action="RequestWebInfo.jsp" method="post">
		Korea Score <input type="text" name="kor" value="90"> <br>
		Englist Score <input type="text" name="eng" value="90"> <br>
		<input type="submit" value="score post for post">
	</form>
	<br><br>
	
	
	<!-- 다양한 방식의 input 전달 -->	
	<form action="RequestParam.jsp">
		Gender : 
		<input type="radio" name="gender" value="man"> Man
		<input type="radio" name="gender" value="woman" checked> Woman
		<br>
		Interest part
		<input type="checkbox" name="interest" value="JAVA" checked> JAVA
		<input type="checkbox" name="interest" value="PYTHON"> PYTHON 
		<input type="checkbox" name="interest" value="HTML"> HTML 
		<br><br>
		Self-Introduction <br>
		<textarea name="intro" cols="40" rows="5"></textarea>
		<br><br>
		<input type="submit" value="infor to post">
		
	
	</form>
	
</body>
</html>