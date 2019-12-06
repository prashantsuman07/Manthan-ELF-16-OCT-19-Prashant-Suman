package com.manthan.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.flipkart.bean.ProductBean;

public class ProductDao {
	public ProductBean searchProduct(int productid) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		ProductBean productBean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart?user=root&password=root");
			String query="select * from product_info where Product_ID= ?";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,productid);
			rs=stmt.executeQuery();

			if(rs.next()) {
				productBean=new ProductBean();

				productBean.setProduct_id(rs.getInt("Product_ID"));
				productBean.setProduct_name(rs.getString("Product_Name"));
				productBean.setProduct_cost(rs.getDouble("Product_Cost"));
				productBean.setProduct_color(rs.getString("Product_Color"));
				productBean.setDescription(rs.getString("Description"));
				productBean.setNo_of_product(rs.getInt("Number_of_products"));


			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) {
					rs.close();
				}
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
		return productBean;
	}
}
