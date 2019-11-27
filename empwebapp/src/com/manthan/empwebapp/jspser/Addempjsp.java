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
@WebServlet("/addempjsp")
public class Addempjsp extends HttpServlet{
	private EmpDao dao=EmpDaoMgr.getDaoIns();
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	if(session!=null) {	
	EmpInfoBean bean=(EmpInfoBean) session.getAttribute("empinfobean");
	int empId=Integer.parseInt(req.getParameter("empid"));
	String empname=req.getParameter("name");
	int age=Integer.parseInt(req.getParameter("age"));
	double sal=Double.parseDouble(req.getParameter("sal"));
	String desig=req.getParameter("desig");
	long mobile=Long.parseLong(req.getParameter("mobile"));



	EmpInfoBean empInfoBean=new EmpInfoBean();
	empInfoBean.setEmpid(empId);
	empInfoBean.setEmpname(empname);
	empInfoBean.setAge(age);
	empInfoBean.setSal(sal);
	empInfoBean.setDesig(desig);
	empInfoBean.setMobile(mobile);
	
		if(dao.addEmp(empInfoBean)) {
			req.setAttribute("addemp", empInfoBean);
			
		}
		else {
			req.setAttribute("msg","not inserted");
		}
		req.getRequestDispatcher("./addpage").forward(req, resp);
	}
	else {
		req.setAttribute("msg", "please login first");
		req.getRequestDispatcher("./loginform").forward(req, resp);
	}
}
}
