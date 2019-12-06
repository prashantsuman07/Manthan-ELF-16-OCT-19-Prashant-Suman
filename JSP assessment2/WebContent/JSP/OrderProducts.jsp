<%@page import="com.manthan.flipkart.bean.OrderBean"%>
<%@page import="com.manthan.flipkart.bean.ProductBean"%>
<%@page import="com.manthan.flipkart.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%UserBean userBean = (UserBean) session.getAttribute("userbean");%>
     <%ProductBean bean=(ProductBean)session.getAttribute("searchproduct"); %>
     <%OrderBean orderBean=(OrderBean)session.getAttribute("order"); %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		if (userBean != null && bean != null) {
	%>
	<h1>Welcome <%=userBean.getUser_name()%></h1>
	<%
	}%>
	<fieldset>
		<legend>ORDER</legend>
		<form method='GET' action='./orderflipkart'>
			<h3>
				Order_id : &nbsp<input type=text name='orderid' required><br>
								<input type=text name='productid' value="<%=bean.getProduct_id()%>" readonly="readonly">
								<input type=text name='userid' value="<%=userBean.getUser_id()%>" readonly="readonly">
								<input type=text name='price' value="<%=bean.getProduct_cost() %>" readonly="readonly">
				<input type=submit value='order'>
		</form>
	</fieldset>
	
	
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
	<a href="./OrderHistory">Order Hsitory</a>
	<a href="./logoutflipkart">Logout</a>
	
</body>
</html>