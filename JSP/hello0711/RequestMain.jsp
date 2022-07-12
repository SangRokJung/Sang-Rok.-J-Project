<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Request test page</title>
</head>
<body>
	<h1>클라이언트 정보를 서버로 전달하는 예제</h1>
	
	<!-- GET방식으로 정보를 전달 -->
	<a href="./RequestWebInfo.jsp?id=Hello&pw=hi">GET방식으로 전달</a>
	<br><br>
	
	<a href="./RequestHeader.jsp?id=Hello&pw=hi">GET방식 헤더정보 출력</a>
	<br><br>
	
	<!-- POST방식으로 정보를 전달 -->
	<form name="testform" action="RequestWebInfo.jsp" method="post">
		국어성적<input type="text" name="kor" value="90"><br>
		영어성적<input type="text" name="eng" value="70"><br><br>
		<input type="submit" value="POST로 성적전달">	
	</form>
	<br><br>
	<!-- 다양한 input방식의 전달 -->
	<form action="RequestParam.jsp">
		성별 :
		<input type="radio" name="gender" value="남자">남자
		<input type="radio" name="gender" value="여자" checked>여자
		<br>
		관심언어 :
		<input type="checkbox" name="favorite" value="JAVA" checked="checked">자바언어
		<input type="checkbox" name="favorite" value="Python">파이썬
		<input type="checkbox" name="favorite" value="HTML">HTML
		<br><br>
		자기소개 :<br>
		<textarea name="intro" cols="40" rows="5"></textarea>
		<br>
		<br>
		<input type="submit" value="POST로 다양한 정보 전달">
	
	</form>
	
</body>
</html>