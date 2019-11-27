package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Rcookie")
public class ReadCookie extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookie=req.getCookies();
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.println("<h1>Cookie value is</h1>");
		for(Cookie c:cookie) {
			out.println(c.getName());
			out.println(c.getValue());
		}
		out.print(cookie);
		out.print("</body>");
		out.print("</html>");

	}
}
