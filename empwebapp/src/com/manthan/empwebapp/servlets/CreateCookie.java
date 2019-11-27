package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie")
public class CreateCookie extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie  cookie=new Cookie("empname", "intern");
	resp.addCookie(cookie);
	PrintWriter out=resp.getWriter();
	out.print("<html>");
	out.print("<body>");
	out.print("<h1>Cookie added succesffully</h1>");
	out.print("</body>");
	out.print("</html>");

}
}
