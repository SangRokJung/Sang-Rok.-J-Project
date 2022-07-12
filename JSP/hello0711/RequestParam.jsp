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
	// request가 가지고 있는 모든 문자정보의 코드를 UTF-8로 변환.
	request.setCharacterEncoding("UTF-8");
	

	String strGender = request.getParameter("gender");
	
	String[] favo = request.getParameterValues("favorite");
	
	String strFavorite = "";
	
	int i;
	for (i = 0; i < favo.length - 1; i++)
	{
		
		strFavorite += favo[i];
		strFavorite += ", "; 
		
	}
	strFavorite += favo[i];
	
	String strIntro = request.getParameter("intro").replace("\r\n", "<br>");;
	
	
%>

	<h1>Request Param 정보 예제</h1>
	
	<ul>
		<li>성별 : <%= strGender %></li>
		<li>관심언어 : <%= strFavorite %></li>
	</ul>
	
	<p>자기소개 : <br> <%= strIntro %></p>
	
	<br><br>
	
	<h1>HTTP 헤더정보 읽기</h1>
	
</body>
</html>

