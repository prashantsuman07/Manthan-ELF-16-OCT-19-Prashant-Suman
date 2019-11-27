<%@page import="com.manthan.empwebapp.bean.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<form method='GET' action='./delejsp'>
			<h3>
				EMP id : &nbsp<input type=text name='empid' required><br>
				<input type=submit value='delete'>
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