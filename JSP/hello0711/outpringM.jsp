<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

 

<%

	// 버퍼에 "<h1>TEST<h1>" 입력

	out.print("<h1>TEST<h1>");

	// TEST가 화면에 출력된다.

 

	// 버퍼를 비운다.

	// "<h1>TEST<h1>"가 버퍼에서 사라진다.

	out.clearBuffer();

	// TEST가 화면에서 지워진다.

 

	// 버퍼는 유한적이다.

	out.println(out.getBufferSize());

	out.println(out.getRemaining());

	

	

	// 다시 버퍼에 "<h2>h2 TEST </h2>" 입력

	out.print("<h2>h2 TEST </h2>");

	// TEST가 화면에 출력된다.

	

	// 출력하고 버퍼를 비운다.

	out.flush();

	

	

%>

 

</body>

</html>