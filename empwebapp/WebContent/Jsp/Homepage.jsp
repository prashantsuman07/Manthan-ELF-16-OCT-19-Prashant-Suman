<%@page import="com.manthan.empwebapp.bean.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%EmpInfoBean empInfoBean=(EmpInfoBean)session.getAttribute("empinfobean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color:navy;">Hello <%=empInfoBean.getEmpname() %>!</h3>
	<a href="./searchpage">Search Emp</a><br>
	<a href="./addpage">Add Emp</a><br>
	<a href="./updatepage">update Emp</a><br>
	<a href="./deljsp">delete Emp</a><br>
	<a href="./seeallEmployee">see all Emp</a><br>
	<a href="./logoutt">Logout</a><br>
</body>
</html>