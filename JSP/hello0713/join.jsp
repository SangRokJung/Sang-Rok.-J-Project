<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="DBPKG.DBConnection" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<%
	int result = 0;
	Connection conn = null;
	Statement stmt	= null;
	
	request.setCharacterEncoding("UTF-8");

	String CUSTNO = request.getParameter("CUSTNO");
	String CUSTNAME = request.getParameter("CUSTNAME");
	String PHONE = request.getParameter("PHONE");
	String ADDRESS= request.getParameter("ADDRESS");
	String JOINDATE = request.getParameter("JOINDATE");
	String GRADE = request.getParameter("GRADE");
	String CITY = request.getParameter("CITY");

	String sql = "INSERT INTO MEMBER_TBL_02 VALUES(" + CUSTNO + ", " +
	"'" + CUSTNAME + "', " +
	"'" + PHONE + "', " +  
	"'" + ADDRESS + "', " +
	"'" + JOINDATE + "', " +
	"'" + GRADE + "', " +
	"'" + CITY + "')";

	System.out.println("[join.jsp] sql = " + sql);
	
try{
	conn = DBConnection.getConnection();
	conn.setAutoCommit(true);

	stmt = conn.createStatement();
	stmt.executeUpdate(sql);
	
	<!-- result = stmt.executeUpdate(sql);
	conn.commit(); -->
}
catch(Exception excp)
{
	result = 0;
	System.out.println("[join.jsp] : " + excp.getMessage());
	
}	
	
%>
</ul>

<script>
document.addEventListener('DOMContentLoaded', ()=>{
	//alert("회원정보가 저장되었습니다.")
});

</script>

</body>
</html>