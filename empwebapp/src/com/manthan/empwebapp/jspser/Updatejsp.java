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
import com.manthan.empwebapp.util.EmpDaoMgr;
@WebServlet("/updateejsp")
public class Updatejsp extends HttpServlet {
	private EmpDao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
		int id=Integer.parseInt(req.getParameter("empid"));
		long mobile=Long.parseLong(req.getParameter("mobile"));
		EmpInfoBean empInfoBean=new EmpInfoBean();
		empInfoBean.setEmpid(id);
		empInfoBean.setMobile(mobile);
		
		
		if(dao.updates(id,mobile)) {
			req.setAttribute("msg","updated successfully");
			}
		else {
			
			req.setAttribute("msg","not updated");
		}
		req.getRequestDispatcher("./updatepage").forward(req, resp);
		}
		else {
			
			req.getRequestDispatcher("./Login.html").include(req, resp);
		}
		
	}
}
