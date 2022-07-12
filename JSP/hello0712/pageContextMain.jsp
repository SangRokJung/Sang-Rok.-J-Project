<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ page import = "common.Person" %>
<%
pageContext.setAttribute("pageInteger", 1000);
pageContext.setAttribute("pageString", "이순신");
pageContext.setAttribute("page", new Person("홍길동", 27));
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Page Context Main</title>
</head>
<body>
<h2>pageContext의 Attribute 읽어보기</h2>
<%
	int pInt = (Integer)(pageContext.getAttribute("pageInteger"));
	String pString = (pageContext.getAttribute("pageString")).toString();
	Person pPerson = (Person)(pageContext.getAttribute("pagePerson"));
%>

<ul>
	<li>정수 : <%= pInt %> </li>
	<li>문자열 : <%= pString %> </li>
	<li>Person : name <%= pPerson.getName() %>, age <%= pPerson.getAge() %> </li>
</ul>
	
</body>
</html>