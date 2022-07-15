<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="common.Person" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
    Map<String, Person> pmap = new HashMap<>();

    pmap.put("jsh", new Person("홍길동", 27));
    pmap.put("lss", new Person("이순신", 22));
    pmap.put("lss", new Person("정상록", 25));

    application.setAttribute("account", pmap);

%>
<script>
</script>

</body>
</html>
