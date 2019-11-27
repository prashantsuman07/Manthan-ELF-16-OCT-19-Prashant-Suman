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
<legend>EMPLOYEE LOGIN</legend>
<form method='POST' action='./login2'>

		<table border="1" align='center'>
			<tr>
				<td>EMP id:</td>
				<td><input type='number' name='empid' required></td>
			</tr>
			<tr>
				<td>EMP pswd:</td>
				<td><input type='password' name='pswd' required></td>
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