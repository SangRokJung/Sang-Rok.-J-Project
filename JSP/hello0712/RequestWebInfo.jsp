<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title</title>
</head>
<body>
	<h1> Clinet Information insert </h1>
	
	<ul>
		<li>데이터 전송 방식(method) : <%= request.getMethod() %>  </li>
		<li>URL : <%= request.getRequestURL() %> </li>
		<li>URI : <%= request.getRequestURI() %> </li>
		<li>Protocol : <%= request.getProtocol() %> </li>
		<li>Server Name : <%= request.getServerName() %> </li>
		<li>Server Port : <%= request.getServerPort() %> </li>
		<li>Client : <%= request.getRemoteAddr() %> </li>
		<li>Query String : <%= request.getQueryString() %> </li>
		<li>Param1 : <%= request.getParameter("id") %></li>
		<li>Param2 : <%= request.getParameter("pw") %></li>
		<li>Param3 : <%= request.getParameter("kor") %></li>
		<li>Param4 : <%= request.getParameter("eng") %></li>
	
	</ul>
	
</body>
</html>