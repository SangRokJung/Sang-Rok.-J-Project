
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
    ArrayList<String> alist = (ArrayList<String>)session.getAttribute("account"</String>)

    String id = alist.get(0);
    String pwd = alist.get(1);

    out.print(id);
    out.print("<h3> pw = " + pwd + "</h3>")


%>



<script>
</script>

</body>
</html>
