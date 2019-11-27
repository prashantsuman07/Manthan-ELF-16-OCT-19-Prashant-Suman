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
@WebServlet("/login2")
public class Login2 extends HttpServlet{
	EmpDao dao=EmpDaoMgr.getDaoIns();
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int empid=Integer.parseInt(req.getParameter("empid"));
	String pswd=req.getParameter("pswd");
	
	EmpInfoBean empInfoBean=dao.login(empid, pswd);
	if (empInfoBean != null) {
		HttpSession session=req.getSession(true);
		session.setAttribute("empinfobean",empInfoBean);
		req.getRequestDispatcher("./homepage").forward(req, resp);
		
	}
	else {
		req.setAttribute("msg", "Invalid Credentials!!!!");
		req.getRequestDispatcher("./loginform").forward(req, resp);
	}
}//post
}//calss
