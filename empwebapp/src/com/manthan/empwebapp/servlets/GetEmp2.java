package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmp2  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp1) throws ServletException, IOException {
		String empIdval=req.getParameter("empId");
		PrintWriter out=resp1.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body bgcolor='#8040f'>\r\n" + 
				"<h1>Employee deatils are for empid = " +empIdval+" <br>\r\n" + 
				
				"</h1>\r\n" + 
				"<h2>"
				+ "Empname = Naveen<br>"+
				"Empage = 18<br>"+
				"Empsal = 26<br>"+
				"Empmobile = 1800456123<br>"+
				 "<form method='GET' action='Empinfo2'>"
				 + "<input type=submit name='submit' >"
				 + "</form> "+
				"</body>\r\n" + 
				"</html>");
		
	}//end of doget()


}//end of class
