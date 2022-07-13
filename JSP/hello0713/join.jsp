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
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address= request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
try{
	conn = DBConnection.getConnection();
	stmt = conn.createStatement();
	
	String sql = "INSERT INTO MEMBER_TBL_02 VALUES(" + custno + ", " +
			"'" + custname + "', " +
			"'" + phone + "', " +  
			"'" + address + "', " +
			"'" + joindate + "', " +
			"'" + grade + "', " +
			"'" + city + "')";
	
	
	result = stmt.executeUpdate(sql);
	
	
	System.out.println("[join.jsp] sql = " + sql);
	conn.commit();
	
}
catch(Exception excp)
{
	result = 0;
	System.out.println(excp.getMessage());
	
		
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