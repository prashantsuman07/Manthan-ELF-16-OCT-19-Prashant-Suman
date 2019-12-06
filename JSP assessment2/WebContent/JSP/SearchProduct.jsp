<%@page import="com.manthan.flipkart.bean.ProductBean"%>
<%@page import="com.manthan.flipkart.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%UserBean userBean = (UserBean) session.getAttribute("userbean");%>
     <%ProductBean bean=(ProductBean)session.getAttribute("searchproduct"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		if (userBean != null) {
	%>
	<h1>Welcome <%=userBean.getUser_name()%></h1>
	<%
	}%>
	<fieldset>
		<legend>SEARCH</legend>
		<form method='GET' action='./searchflipkart'>
			<h3>
				Prodcut_Id : &nbsp<input type=text name='productid' required><br>
				<input type=submit value='search'>
		</form>
	</fieldset>
	
	
	<%
		if (bean != null) {
	%>
	
	
	<table>
		<tr>
			<td>Product_id:</td>
			<td><%=bean.getProduct_id()%></td>
			<td></td>
		</tr>
		<tr>
			<td>Product_name:</td>
			<td><%=bean.getProduct_name()%></td>
			<td></td>
		</tr>
		<tr>
			<td>Product Cost:</td>
			<td><%=bean.getProduct_cost()%></td>
			<td></td>
		</tr>
		<tr>
			<td>Product Color:</td>
			<td><%=bean.getProduct_color()%></td>
			<td></td>
		</tr>
		<tr>
			<td>Description:</td>
			<td><%=bean.getDescription()%></td>
			<td></td>
		</tr>
		<tr>
			<td>No_of_Products:</td>
			<td><%=bean.getNo_of_product()%></td>
			<td></td>
		</tr>	
	</table>
	<%
	}%>
	
	<a href="./orderproduct1">order items</a>
	<a href="./logoutflipkart">Logout</a>
</body>
</html>