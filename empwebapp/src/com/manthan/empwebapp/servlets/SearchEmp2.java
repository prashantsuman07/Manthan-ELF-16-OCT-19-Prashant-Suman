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
import com.manthan.empwebapp.dao.EmpDaoImpl;
import com.manthan.empwebapp.util.EmpDaoMgr;
@WebServlet("/searchEmp2")
public class SearchEmp2 extends HttpServlet {
	private EmpDao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("empid"));
		EmpInfoBean empInfoBean=dao.searchEmp(id);;
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		HttpSession session=req.getSession(false);
		if(session!=null) {
		if(empInfoBean!=null) {
			
			out.print("<h2>empid: " + id+ " found <hr color='cyan'>");
			out.print("<br>name: "+empInfoBean.getEmpname());
			out.print("<br>age: "+empInfoBean.getAge()  );
			out.print("<br>sal: "+empInfoBean.getSal() );
			out.print("<br>desig: "+empInfoBean.getDesig());		
			out.print("<br>mobile: "+empInfoBean.getMobile());
			out.print("<br>pswd: "+empInfoBean.getPswd());
	}
		else {
			out.print("<h2>empid: " + id+ " Not found");
		}
		
		}
		
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}