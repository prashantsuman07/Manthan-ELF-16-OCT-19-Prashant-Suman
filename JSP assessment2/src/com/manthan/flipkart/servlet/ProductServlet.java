package com.manthan.flipkart.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.manthan.flipkart.bean.ProductBean;
import com.manthan.flipkart.dao.ProductDao;
@WebServlet("/searchflipkart")
public class ProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(true);
		if(session!=null) {
			int productid=Integer.parseInt(req.getParameter("productid"));
			ProductDao dao=new ProductDao();
			ProductBean productBean=dao.searchProduct(productid);
			if(productBean!=null) {
				session.setAttribute("searchproduct", productBean);

			}
			else {
				req.setAttribute("msg","product not found");
			}
			req.getRequestDispatcher("./searchproduct").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginflipkart").forward(req, resp);
		}
	}
}
