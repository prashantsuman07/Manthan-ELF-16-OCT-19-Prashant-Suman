package com.manthan.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.manthan.flipkart.bean.OrderBean;
import com.manthan.flipkart.bean.UserBean;

public class OrderDao {
	public boolean addOrder(OrderBean orderBean) {
		Connection con=null;
		PreparedStatement stmt=null;
		boolean isAdded=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart?user=root&password=root");
			String query="insert into Order_Info values(?,?,?,?)";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,orderBean.getOrder_id());
			stmt.setInt(2,orderBean.getProduct_id());
			stmt.setInt(3,orderBean.getUser_id());
			stmt.setDouble(4,orderBean.getPrice());
			int n=stmt.executeUpdate();
			if(n>0) {
				isAdded=true;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {

				if(stmt !=null) {
					stmt.close();
				}
				if(con !=null) {
					con.close();
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}

		}
		return isAdded;
	}

}

