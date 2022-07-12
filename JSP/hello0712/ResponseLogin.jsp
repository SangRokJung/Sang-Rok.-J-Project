<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kor">
<head>
<meta charset="UTF-8">
<title>Response login</title>
</head>
<body>
<%
String id = request.getParameter("user_id");
String pwd = request.getParameter("user_pwd");

if(id.equalsIgnoreCase("jsh") && pwd.equalsIgnoreCase("1234")){
	//로그인 성공.
	response.sendRedirect("ResponseWelcome.jsp");
}
else{
	// 로그인 실패.
	request.getRequestDispatcher("ResponseMain.jsp?loginError=1").forward(request, response);
}
	

%>

</body>
</html>