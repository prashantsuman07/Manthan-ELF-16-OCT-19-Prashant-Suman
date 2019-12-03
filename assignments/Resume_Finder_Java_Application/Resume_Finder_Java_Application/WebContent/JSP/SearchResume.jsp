<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search resume</title>
<style type="text/css">
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

<input type="text" value="search" placeholder="Search here" name="search"  style="border-style: solid; width:400px"/>
<input type="submit" value="Search Resume">
</form>
</div>
</body>
</html>