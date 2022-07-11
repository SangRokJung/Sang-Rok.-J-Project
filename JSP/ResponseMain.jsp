<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>ResponseMain</title>
</head>
<body>
<h2>로그인</h2>
<%
String loginError = request.getParameter("loginError");
if (loginError != null)
	out.print("로그인 실패");
%>

<form action="ResponseLogin.jsp" method="post">
	아이디:<input type="text" name="user_id"><br>
	패스워드:<input type="text" name="user_pwd"><br>
	<input type="submit" value="로그인">
</form>

<form action="ResponseHeader.jsp" method="get">
날짜:<input type="text" name="date" value="2022-07-11"><br>
숫자:<input type="text" name="int" value="123"><br>
문자:<input type="text" name="str" value="이순신"><br>
	<input type="submit" value="Response 헤더 정보 설정">
</form>


</body>
</html>