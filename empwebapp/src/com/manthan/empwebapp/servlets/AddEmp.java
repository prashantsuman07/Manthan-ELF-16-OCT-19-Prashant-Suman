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
@WebServlet("/addEmp")
public class AddEmp extends HttpServlet {
	private EmpDao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("empid"));
		String empname=req.getParameter("empname");
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
		empInfoBean.setMobile(empId);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		HttpSession session=req.getSession(false);
		if(session!=null) {
			EmpInfoBean bean=(EmpInfoBean) session.getAttribute("empinfobean");
			if(dao.addEmp(empInfoBean)) {
				out.print("<h2>"+bean.getEmpname()+"successfully inserted </h2>");
			}
			else
			{
				out.print("<h2>+bean.getEmpname()+\"not inserted ");
			}

		}
		else {
			out.print("<h2>not success</h2>");
			req.getRequestDispatcher("./Login.html").include(req, resp);
		}
		out.print("</body>");
		out.print("</html>");

	}

}
