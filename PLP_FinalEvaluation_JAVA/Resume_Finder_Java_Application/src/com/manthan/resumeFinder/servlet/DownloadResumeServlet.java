package com.manthan.resumeFinder.servlet;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DownloadResume")
public class DownloadResumeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
		PrintWriter out = resp.getWriter();  
		String filename =(String) req.getParameter("url");;   
		String filepath = "C:\\Users\\CBT\\Desktop\\upload\\";   
		resp.setContentType("APPLICATION/PDF");   
		resp.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   

		FileInputStream fileInputStream = new FileInputStream(filepath + filename);  

		int i;   
		while ((i=fileInputStream.read()) != -1) {  
			out.write(i);   
		}   
		fileInputStream.close();   
		out.close();   
	}

}
