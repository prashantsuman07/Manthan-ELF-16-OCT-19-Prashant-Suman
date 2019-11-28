package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmpServlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp1) throws ServletException, IOException {
		PrintWriter out=resp1.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body bgcolor='#8080f'>\r\n" + 
				"<h1>Employee deatils are: <br>\r\n" + 
				 
				"</h1>\r\n" + 
				"<h2>Empid = 101 <br>"
				+ "Empname = Maria<br>"+
				"Empage = 18<br>"+
				"Empsal = 260000<br>"+
				"Empmobile = 18009001258<br>"+
				"</body>\r\n" + 
				"</html>");
		
	}//end of doget()

}
