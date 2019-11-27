<%@page import="com.manthan.empwebapp.bean.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%EmpInfoBean empInfoBean = (EmpInfoBean) request.getAttribute("addemp");
    String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>EMPLOYEE LOGIN</legend>
<form method='POST' action='./addempjsp'>

		<table border="1" align='center'>
			<tr>
				<td>EMP id:</td>
				<td><input type='number' name='empid' required></td>
			</tr>
			<tr>
				<td>EMP name:</td>
				<td><input type='text' name='name' required></td>
			</tr>
			<tr>
				<td>EMP age:</td>
				<td><input type='number' name='age' required></td>
			</tr>
			<tr>
				<td>EMP sal:</td>
				<td><input type='number' name='sal' required></td>
			</tr>
			<tr>
				<td>EMP desig:</td>
				<td><input type='text' name='desig' required></td>
			</tr>
			<tr>
				<td>EMP mobile:</td>
				<td><input type='text' name='mobile' required></td>
			</tr>
		
			<tr>
				
				<td colspan="3" align="center">
				<input type=submit value='AddEmp'></td>
			</tr>
		</table>
</form>
</fieldset>	
<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h3 style="color: navy;"><%=msg%></h3>
	<%
		}
	%>
	<%
		if (empInfoBean != null) {
	%>
	<table>
		<tr>
			<td>emp_id:</td>
			<td><%=empInfoBean.getEmpid()%></td>
		</tr>
		<tr>
			<td>emp_name:</td>
			<td><%=empInfoBean.getEmpname()%></td>
		</tr>
		<tr>
			<td>emp age:</td>
			<td><%=empInfoBean.getAge()%></td>
		</tr>
		<tr>
			<td>emp sal:</td>
			<td><%=empInfoBean.getSal()%></td>
		</tr>
		<tr>
			<td>emp desig:</td>
			<td><%=empInfoBean.getDesig()%></td>
		</tr>
		<tr>
			<td>emp mobile:</td>
			<td><%=empInfoBean.getMobile()%></td>
		</tr>
		<tr>
			<td>emp pswd:</td>
			<td><%=empInfoBean.getPswd()%></td>
		</tr>
	</table>
	<%} %>
</body>
</html>