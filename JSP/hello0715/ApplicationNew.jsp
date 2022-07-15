<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="common.Person" %>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>application엣 값을 가지고 온다.</h2>

<% 
    //1. application에서 map을 가져온다.
    //2. map에서 person 정보를 가져온다.
    //3. loop 돌면서 <tr> <td>를 만든다.

    Map<String, Person) mMap = (Map<String, Person>)application.getAttribute("account")
    
    set<String> keyset = mMap.keyset();
    
    out.print("<table border=\"1\">");
    for (String key : keyset) {
        Person p = mMap.get(key);
        out.print("<tr>");

        out.print("<td>" + p.getName() + "</td>");
        out.print("<td>" + p.getAge() + "</td>");

        out.print("</tr>");
    }
    out.print("</table>");

%>
<table>
<tr>
    <td>이름 : 정상록</td>
    <td>나이 : 25</td>
</tr>
</table>

</body>
</html>
