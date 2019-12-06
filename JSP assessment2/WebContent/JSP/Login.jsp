<%@page import="com.manthan.flipkart.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null) { %>
<%=msg %>
<%} %>
<fieldset>
<legend>USER LOGIN</legend>
<form method='POST' action='./loginflipkart1'>

		<table border="1" align='center'>
			<tr>
				<td>Email:</td>
				<td><input type='email' name='email' required></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' required></td>
			</tr>
			<tr>
				
				<td colspan="3" align="center">
				<input type=submit value='Login'></td>
			</tr>
		</table>
</form>
</fieldset>	
</body>
</html>