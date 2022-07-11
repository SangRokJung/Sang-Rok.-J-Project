<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String method="";

method = request.getMethod();

%>
<h1>클라이언트에서 전달된 정보(request)를 출력하는 예제</h1>

<ul>
	<li>데이터전송방식 (Method) : <%= method %></li>
	<li>URL : <%= request.getRequestURL() %></li>
	<li>URI : <%= request.getRequestURI() %></li>
	<li>Protocol : <%= request.getProtocol() %></li>
	<li>Server Name : <%= request.getServerName() %></li>
	<li>Server Port : <%= request.getServerPort() %></li>
	<li>Client : <%= request.getRemoteAddr() %></li>
	<li>Query String: <%= request.getQueryString() %></li>
	<li>Param1 : <%= request.getParameter("kor") %></li>
	<li>Param2 : <%= request.getParameter("eng") %></li>
	
</ul>

</body>
</html>