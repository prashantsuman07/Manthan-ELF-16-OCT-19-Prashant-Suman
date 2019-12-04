<%@page import="com.manthan.resumeFinder.bean.ResumeBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	ArrayList<ResumeBean>alBean=(ArrayList<ResumeBean>)request.getAttribute("resumeBean");
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search resume</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
body{
background-color: lightblue;
}
.Upload{
width:600px;
margin:auto;
font-family: cursive;

}
</style>
</head>
<body>
<a href="./UploadResumeJsp"><h2 align="right">Upload Resume</h2></a>
<div class="Upload" > 
<h1 align="Center" >Search Resume<hr></h1>
<form action="./SearchResume" method="get" align="center">

<input type="text" placeholder="Search here" name="search"  style="border-style: solid; width:400px" required/>
<input type="submit" value="Search Resume">
</form>
<br>
<% if(msg!=null && !msg.isEmpty()){%>
		<p align="center"><%= msg%></p>
	<%} %>
<% if(alBean!=null && !alBean.isEmpty()){ %>
<br>	
<table  align="center" width="100%">
<tr>
			<td>File Name</td>
			<td>Name</td>
			<td>E-mail</td>
			<td>Download</td>
		</tr>

	
	<%for(ResumeBean result:alBean) {%>
	
		
		<tr>
			<td>
			<%=result.getFilename()%></td>
			<td><%=result.getName()%></td>
			<td><%=result.getEmail()%></td>
			<td align="center"><a href='./DownloadResume?url=<%=result.getFilename()%>'><i class="fa fa-download"></i></a></td>
		</tr>
	
	<%}%>
	</table>
		<% }%>
		
</div>
</body>
</html>