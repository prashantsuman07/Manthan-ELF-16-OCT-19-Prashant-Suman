package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.bean.EmpInfoBean;
import com.manthan.empwebapp.dao.EmpDao;
import com.manthan.empwebapp.util.EmpDaoMgr;
@WebServlet("/login")
public class LoginSer extends HttpServlet {
	private EmpDao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("empid"));
		String pswd=req.getParameter("pswd");
		EmpInfoBean empInfoBean=dao.login(empId, pswd);
		PrintWriter out=resp.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n");
		if(empInfoBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("empinfobean", empInfoBean);
			//8session.setMaxInactiveInterval(15);
			out.print(
					"<table border=\"1\">\r\n" + 
					"			<tr>\r\n" + 
					"				<td><a href='./AddEmp.html'>create emp</a></td>\r\n" + 
					"			</tr>\r\n" + 
					"			<tr>\r\n" + 
					"				<td><a href='./Empinfo.html'>search emp</a></td>\r\n" + 
					"			<tr>\r\n" + 
					"				<td><a href='./Update.html'>update emp</a></td>\r\n" + 
					"			</tr>\r\n" + 
					"				<tr>\r\n" + 
					"				<td><a href='./del.html'>delete emp</a></td>\r\n" + 
					"			</tr>\r\n" + 
					"           <tr>\r\n" + 
					"				<td><a href=\'./logout'>logout</a></td>\r\n" + 
					"			</tr>\r\n" + 
					"		</table>\r\n" ); 
					
		}
		else
		{
			out.print("<h2>invalid credentials</h2>" +"</form>\r\n" );
			req.getRequestDispatcher("./Login.html").include(req, resp);
			out.print(		"</body>\r\n" + 
					"</html>");
		}
		
	}
		
}
