<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>

<%@ page import="DBPKG.DBConnection" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원 등록</title>
</head>
<body>
<ul></ul>
<%
//register.jsp의 form에 입력한 데이터를 화면(body) 에 출력하는 코드
	
	
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	out.print("<li>" + custno + "</li>");
	out.print("<li>" + custname + "</li>");
	out.print("<li>" + phone + "</li>");
	out.print("<li>" + address + "</li>");
	out.print("<li>" + grade + "</li>");
	out.print("<li>" + city + "</li>");
	
%>

<%@ include file="header.jsp" %>

<h2>홈쇼핑 회원 등록</h2>

<form id="id_regForm" name="regForm" method="post">
	<table border="1">
<%

String maxCustno = "";

try
{
	Statement stmt = null; 	// 쿼리를 처리하는 객체
	ResultSet rset = null;	// 쿼리의 결과를 저장하는 객체

	Connection conn = DBConnection.getConnection();
	
	String sql = "SELECT max(custno)+1 FROM MEMBER_TBL_02";
	
	stmt = conn.createStatement();
	rset = stmt.executeQuery(sql);
	
	// 커서를 옮기고 데이터를 가지고 온다. 
	// cursor : ResultSet은 표형식으로 논리적 구성. 커서는 이러한 논리적 표의 row를 가리키는 객체 
	while(true == rset.next())
	{
		maxCustno = rset.getString(1);
		
	}

	// 각각의 인스턴스를 정리한다.
	rset.close();	
	stmt.close();	
	conn.close();	
		
}
catch(Exception excp)
{
	System.out.println(excp.getMessage());
	excp.printStackTrace();
	
}

%>




	<tr>
		<td>회원번호(자동발생)</td>
		<td><input type="text" id="id_custno" name="custno" value="<%= maxCustno %>" readonly></td>
	</tr>
	
	<tr>
		<td>회원성명</td>
		<td><input type="text" id="id_custname" name="custname"></td>
	</tr>
	
	<tr>
		<td>회원전화</td>
		<td><input type="text" id="id_phone" name="phone"></td>
	</tr>
	
	
	<tr>
		<td>회원주소</td>
		<td><input type="text" id="id_address" name="address"></td>
	</tr>
	
	<tr>
		<td>가입일자</td>
		<td><input type="text" id="id_joindate" name="joindate"></td>
	</tr>
		
	<tr>
		<td>고객등급[A:VIP,B:일반,C:직원]</td>
		<td><input type="text" id="id_grade" name="grade"></td>	
	</tr>
		
	<tr>
		<td>도시코드</td>
		<td><input type="text" id="id_city" name="city"></td>
	</tr>	
	</table>
</form>
<button id="id_regMember">등록</button>
<button id="id_InqMember">조회</button>
	

<%@ include file="footer.jsp" %>

<iframe name="hiddenframe" style="display:none" ></iframe>

<script>

(function(){

	const frmReg = document.getElementById("id_regForm");
	
	const btnReg = document.getElementById("id_regMember");
	const btnInq = document.getElementById("id_InqMember");
	
	const checkDataSize = function()
	{
		// 배열, 오브젝트.
		const arInputBox = [
			{ box : document.querySelector("#id_custname"), errMsg : '회원성명이 입력되지 않았습니다.'	},
			{ box : document.querySelector("#id_phone"),	errMsg : '회원전화가 입력되지 않았습니다.' 	},
			{ box : document.querySelector("#id_address"),	errMsg : '회원주소가 입력되지 않았습니다.'	},
			{ box : document.querySelector("#id_joindate"), errMsg : '가입일자가 입력되지 않았습니다.'	},
			{ box : document.querySelector("#id_grade"),	errMsg : '고객등급이 입력되지 않았습니다.'	},
			{ box : document.querySelector("#id_city"),		errMsg : '도시코드가 입력되지 않았습니다.'  }
		];

		
		for (let i = 0; i < arInputBox.length; i++)
		{
			if (arInputBox[i].box.value.length === 0)
			{
				alert(arInputBox[i].errMsg);
				arInputBox[i].box.focus();
				return false;
				
			}
			
		}
		
		return true;
		
	}

	btnReg.addEventListener('click', ()=>{
		if (true == checkDataSize())
		{
			// join.jsp : 폼데이터를 받아서 DB에 저장하는 기능을 하는 jsp
			frmReg.action = "join.jsp";
			frmReg.target = "hiddenframe";
			frmReg.submit();
		}
		
	});
	
	
	btnInq.addEventListener('click', ()=>{
		location.href = 'inquiry.jsp';
		
		
	});
	
})();

</script>
</body>
</html>