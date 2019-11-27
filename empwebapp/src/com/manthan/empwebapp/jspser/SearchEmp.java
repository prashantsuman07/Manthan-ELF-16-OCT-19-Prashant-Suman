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
@WebServlet("/search")
public class SearchEmp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empid"));
			EmpDao dao=new EmpDaoImpl();
			EmpInfoBean empInfoBean=dao.searchEmp(empId);
			if(empInfoBean!=null) {
				req.setAttribute("searchemp", empInfoBean);
				
			}
			else {
				req.setAttribute("msg","empId not found");
			}
			req.getRequestDispatcher("./searchpage").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	}
}
