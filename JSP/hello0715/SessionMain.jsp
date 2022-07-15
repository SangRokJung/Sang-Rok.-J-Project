
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
    ArrayList<String> list = new ArrayList<>();
        list.add("jsh");
        list.add("1234");

        session.setAttribute("account", list);
%>

<h2>페이지 이름</h2>
<a href="SessionLocation.jsp">SessionLocation.jsp로 이름</a>

<script>
</script>

</body>
</html>
