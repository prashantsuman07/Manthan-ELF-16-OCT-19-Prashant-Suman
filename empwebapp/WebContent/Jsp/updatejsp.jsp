<%@page import="com.manthan.empwebapp.bean.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<%
	
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>EMPLOYEE LOGIN</legend>
		<form method='POST' action='./updateejsp'>
			<h3>
				EMP id : &nbsp<input type=text name='empid' required><br>
				
				EMP id : &nbsp<input type=text name='mobile' required><br>
				<input type=submit value='update'></h3>
		</form>
	</fieldset>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h3 style="color: navy;"><%=msg%></h3>
	<%
		}
	%>
	
</body>
</html>