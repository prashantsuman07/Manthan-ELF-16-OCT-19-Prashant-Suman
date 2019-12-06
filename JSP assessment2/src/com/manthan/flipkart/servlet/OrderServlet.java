package com.manthan.flipkart.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.flipkart.bean.OrderBean;
import com.manthan.flipkart.bean.ProductBean;
import com.manthan.flipkart.bean.UserBean;
import com.manthan.flipkart.dao.OrderDao;
@WebServlet("/orderflipkart")
public class OrderServlet extends HttpServlet {
	OrderDao order=new OrderDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(true);
		if(session!=null) {
			int orderid=Integer.parseInt(req.getParameter("orderid"));
			int productid=Integer.parseInt(req.getParameter("productid"));
			int userid=Integer.parseInt(req.getParameter("userid"));
			double price=Double.parseDouble(req.getParameter("price"));

			OrderBean orderBean=new OrderBean();
			orderBean.setOrder_id(orderid);
			orderBean.setProduct_id(productid);
			orderBean.setUser_id(userid);
			orderBean.setPrice(price);

			if(order.addOrder(orderBean)) {
				session.setAttribute("order",orderBean );
			}
			else {
				req.setAttribute("msg","not ordered");
			}
			req.getRequestDispatcher("./orderproduct1").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginflipkart").forward(req, resp);
		}
	}
}


