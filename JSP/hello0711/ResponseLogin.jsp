<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Response Login</title>
</head>
<body>
<%
String id = request.getParameter("user_id");
String pwd = request.getParameter("user_pwd");

if (id.equalsIgnoreCase("jsh") && pwd.equalsIgnoreCase("1234"))
{
	//로그인성공.
	response.sendRedirect("ResponseWelcome.jsp");
	
}
else
{
	request.getRequestDispatcher("ResponseMain.jsp?loginError=1").forward(request, response);
}

%>
</body>
</html>