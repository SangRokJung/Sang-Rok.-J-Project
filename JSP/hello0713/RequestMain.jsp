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

    request.setAttribute("reqPerson", new Person("임걱정", 45));
    request.setAttribute("reqAddress", "충남 계롱산 기슭");

    request.removeAttribute(name);

%>
<% 

    // 2. seconds root
    String name = "";
    int age = 0;
    String address = "";
    Person p = (Person)(request.getAttribute("reqPerson"));

    name = p.getName();
    name = p.getAge();


    // removeAttribute
    request.removeAttribute("reqAddress"); //null

    try{
        name = request.getAttribute("reqAddress").toString();
    }
    catch(Exception e){
        out.print("주소가 없습니다.")
    }

%>

// 1. first root 단순하나 무식한 방법
<h2> <%= ((Person)(request.getAttribute("reqPerson"))).getName() %> </h2>

// 2. seconds root
<h2> <%= name %></h2>
<h2> <%= age %></h2>
<h2> <%= address %></h2>

<% 
    // 포워딩을 할 dispatcher를 가져온다.
    RequestDispatcher rd = request.getRequestDispatcher("RequestForward.jsp?id=admin&pwd1234").forward(request, response);
    re.forward(request, response);

%>

<script>
//바로 forward가 되기 때문에 alert가 나오지 않는다.
alert("aaa")
</script>
	
</body>
</html>