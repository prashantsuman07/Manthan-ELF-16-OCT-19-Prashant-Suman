<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <h3>${requestScope["message"]}</h3>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Resume</title>
<style type="text/css">
.Upload{
width:600px;
margin:auto;

}
</style>
</head>
<body>
<a href="./SearchResumeJsp"><h2 align="right">Search Resume</h2></a>
<div class="Upload" > 
<h1 align="Center">Upload Resume<hr></h1>
<form action="./UploadResume" method="post" enctype = "multipart/form-data" align="center">
<label>Choose any file:</label>
<input 
type="file" name = "file" accept="application/pdf, application/msword" style="border-style: solid; width:400px"/><br><br>
<input type="submit" value="Upload Resume">
</form>
</div>
</body>
</html>