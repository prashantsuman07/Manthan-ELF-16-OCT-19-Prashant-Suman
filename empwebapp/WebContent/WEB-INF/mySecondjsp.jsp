<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%!
int a=100;
public int geta(){
	return a;
}
public void seta(int a){
	this.a=a;
}
String name="kunal";
public String getname(){
	return name;
}
public String getname(String gname){
	return gname;
}
public void setname(String name){
	this.name=name;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% boolean isTrue=true; %><br>
<h2>Hola amigos</h2><br>
a= <%=a %><br>
a2= <%=geta() %><br>

name1= <%=name %><br>
name2= <%=getname() %><br>
name1= <%=getname("abc") %><br>

<%for(int i=0;i<5;i++){ %>
<%=getname() %><br>
<%} %>
</body>
</html>
<%--  <jsp:forward page="date.html"></jsp:forward>--%>
<%-- <jsp:include page="/firstjsp"></jsp:include> --%>
<jsp:include page="/WEB-INF/date.html"></jsp:include>