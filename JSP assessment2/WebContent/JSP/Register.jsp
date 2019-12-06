<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Register Here</legend>
<form method='POST' action='./registerflipkart'>

		<table border="1" align='center'>
			<tr>
				<td>User id:</td>
				<td><input type='number' name='userid' required></td>
			</tr>
			<tr>
				<td>User name:</td>
				<td><input type='text' name='username' required></td>
			</tr>
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
				<input type=submit value='Register'></td>
			</tr>
		</table>
</form>
</fieldset>	
</body>
</html>