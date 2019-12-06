package com.manthan.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.manthan.flipkart.bean.UserBean;

public class UserdaoImpl implements UserDao{

	@Override
	public UserBean login(String email, String password) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		UserBean userBean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart?user=root&password=root");
			String query="select * from User_Info where Email= ? and Password=?";
			stmt=con.prepareStatement(query);
			stmt.setString(1,email);
			stmt.setString(2,password);
			rs=stmt.executeQuery();
			if(rs.next()) {
				userBean=new UserBean();
				userBean.setUser_name(rs.getString("User_Name"));
				userBean.setUser_id(rs.getInt("User_ID"));
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
		return userBean;
	}

	@Override
	public boolean register(UserBean userBean) {
		Connection con=null;
		PreparedStatement stmt=null;
		boolean isAdded=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart?user=root&password=root");
			String query="insert into User_Info values(?,?,?,?)";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,userBean.getUser_id());
			stmt.setString(2,userBean.getUser_name());
			stmt.setString(3,userBean.getEmail());
			stmt.setString(4,userBean.getPassword());
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
