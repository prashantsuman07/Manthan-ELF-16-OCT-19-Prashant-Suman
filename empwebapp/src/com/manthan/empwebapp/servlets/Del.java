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
@WebServlet("/del")
public class Del extends HttpServlet{
	private EmpDao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("empid"));
		EmpInfoBean empInfoBean=new EmpInfoBean();
		empInfoBean.setEmpid(id);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
		if(dao.del(id)) {
					
					out.print("<h2>empid: " + id+ " found <hr color='cyan'>");	
					out.print("<br>deletedddddddd");
					req.getRequestDispatcher("./Del.html").include(req, resp);
			}
				else {
					out.print("<h2>empid: " + id+ " Not found");
					req.getRequestDispatcher("./Del.html").include(req, resp);
				}
				
				}
				else {
					out.print("<h2>not success</h2>");
					req.getRequestDispatcher("./Login.html").include(req, resp);
				}
				out.print("</body>");
				out.print("</html>");
				out.close();
			}
}
