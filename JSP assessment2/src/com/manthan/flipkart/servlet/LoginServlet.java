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
@WebServlet("/loginflipkart1")
public class LoginServlet extends HttpServlet {
	UserDao dao=new UserdaoImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");

		UserBean userBean=dao.login(email, password);
		if (userBean != null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("userbean",userBean);
			req.getRequestDispatcher("./searchproduct").forward(req, resp);

		}
		else {
			req.setAttribute("msg", "Invalid Credentials!!!!");
			req.getRequestDispatcher("./loginflipkart").forward(req, resp);
		}
	}

}
