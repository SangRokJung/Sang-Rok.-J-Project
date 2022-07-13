<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="common.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
    // forwarding
    Person p = (Person)(request. getAttribute("reqPerson"));
    out.print("<h1>" + p.getName() + "</h1>");
    out.print("<h1>" + request.getParameter("id") + "</h1>");
    out.print("<h1>" + request.getParameter("pwd") + "</h1>");
%>
	
</body>
</html>