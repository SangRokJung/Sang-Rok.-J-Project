<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response</title>
</head>
<body>
<h2> Login</h2>

<%
// 실패한 결과로서의 응답인 경우 메세지 박스를 뛰워줘야함.
String loginError = request.getParameter("loginError");
if (loginError != null)
	out.print("로그인 실패");

%>

<form action="ResponseLogin.jsp" method="post">
	ID : <input type="text" name="user_id"> <br>
	PS : <input type="text" name="user_pwd"> <br>
	<input type="submit" value="LOGIN">
</form>

<form action="ResponseHeader.jsp" method="get"> <br>
날짜 : <input type="text" name="date" value="2022-07-11"> <br>
숫자 : <input type="text" name="int" value="123"> <br>
문자 : <input type="text" name="str" value="이순신"> <br>
		<input type="submit" name="Response 헤더 정보 실행">

</form>

</body>
</html>