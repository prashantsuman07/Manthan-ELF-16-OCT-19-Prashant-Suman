<%@page import="com.manthan.flipkart.bean.OrderBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%OrderBean orderBean=(OrderBean)session.getAttribute("order"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%		
		if (orderBean != null) {
	%>
	
	
	<table>
		<tr>
			<td>Order_id:</td>
			<td><%=orderBean.getProduct_id()%></td>
			<td></td>
		</tr>
		<tr>
			<td>Product_id:</td>
			<td><%=orderBean.getProduct_id()%></td>
			<td></td>
		</tr>
		<tr>
			<td>User_id:</td>
			<td><%=orderBean.getUser_id()%></td>
			<td></td>
		</tr>
		
		<tr>
			<td>Product Cost:</td>
			<td><%=orderBean.getPrice()%></td>
			<td></td>
		</tr>
	</table>
	<%
	}%>
	<a href="./logoutflipkart">Logout</a>
</body>
</html>