<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ page import = "java.util.Collection" %>

<%
SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd");

long add_date = s.parse(request.getParameter("date")).getTime();
int add_int = Integer.parseInt(request.getParameter("int"));
String add_str = request.getParameter("str");

response.addDateHeader("goodday", add_date);
response.addIntHeader("goodNumber", add_int);
response.addHeader("goodman", "세종대왕");
response.addHeader("goodman", add_str);
%>
<!DOCTYPE html>
<html lang="kor">
<head>
<meta charset="UTF-8">
<title>ResponseHeader</title>
</head>
<body>

<ul>
<%
Collection<String> headerNames = response.getHeaderNames();
for (String headerName : headerNames){
	String value = response.getHeader(headerName);
%>
	<li> <%= headerName %> : <%= value %> </li>
<%
} 
%>

</ul>

</body>
</html>