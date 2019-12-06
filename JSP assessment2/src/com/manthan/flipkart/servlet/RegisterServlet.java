package com.manthan.flipkart.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.flipkart.bean.UserBean;
import com.manthan.flipkart.dao.UserDao;
import com.manthan.flipkart.dao.UserdaoImpl;
@WebServlet("/registerflipkart")
public class RegisterServlet extends HttpServlet {
	private UserDao dao=new UserdaoImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {	
			UserBean bean=(UserBean) session.getAttribute("empinfobean");
			int userid=Integer.parseInt(req.getParameter("userid"));
			String username=req.getParameter("username");
			String email=req.getParameter("email");
			String password=req.getParameter("password");

			UserBean userbean=new UserBean();
			userbean.setUser_id(userid);
			userbean.setUser_name(username);
			userbean.setEmail(email);
			userbean.setPassword(password);

			if(dao.register(userbean)) {
				req.setAttribute("adduser", userbean);

			}
			else {
				req.setAttribute("msg","not registered");
			}
			req.getRequestDispatcher("./loginflipkart").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./registerpage").forward(req, resp);
		}
	}

}
