package com.manthan.empwebapp.jspser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.bean.EmpInfoBean;
import com.manthan.empwebapp.dao.EmpDao;
import com.manthan.empwebapp.dao.EmpDaoImpl;
import com.manthan.empwebapp.util.EmpDaoMgr;
@WebServlet("/delejsp")
public class Deljsp extends HttpServlet {
	private EmpDao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
			int empId=Integer.parseInt(req.getParameter("empid"));
			
			if(dao.del(empId)) {
				req.setAttribute("msg", "delted successfully");
				
			}
			else {
				req.setAttribute("msg","empId not found");
			}
			req.getRequestDispatcher("./deljsp").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	}
}
