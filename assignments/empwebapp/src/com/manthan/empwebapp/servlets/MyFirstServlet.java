
package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/abcd")
public class MyFirstServlet extends HttpServlet {
	public MyFirstServlet() {
		System.out.println("hey");
	}
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp1) throws ServletException, IOException {
//		Date date=new Date();
//		//resp1.setHeader("refresh", "1");
//		ServletContext context=req.getServletContext();
//		String s=context.getInitParameter("java");
//		ServletConfig config=getServletConfig();
//		String s1=config.getInitParameter("msg");
//		PrintWriter out=resp1.getWriter();
//		out.print("<!DOCTYPE html>\r\n" + 
//				"<html>\r\n" + 
//				"<head>\r\n" + 
//				"<meta http-equiv='refresh' content='1'/>\r\n" + 
//				"<title>Insert title here</title>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"<h1> Current date & time:<br>\r\n" + 
//				 date +  
//				"</h1>\r\n" + s + s1 +
//				"</body>\r\n" + 
//				"</html>");
//		
//	}//end of doget()
}//end of class
