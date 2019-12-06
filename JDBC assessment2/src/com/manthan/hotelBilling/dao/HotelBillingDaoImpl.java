package com.manthan.hotelBilling.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.manthan.hotelBilling.bean.HotelBillingBean;

public class HotelBillingDaoImpl implements HotelBillingDao{
	HotelBillingBean hotelBillingBean=new HotelBillingBean();
	double totalBill=0;
	public int addFoodItem(HotelBillingBean hotelBillingBean){
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Item id");
		int item_id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter Food Item name");
		String foodname=sc.nextLine();

		System.out.println("enter Food price");
		double foodprice=sc.nextDouble();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB?user=root&password=root");
			String query="insert into Hotel_Bill values(?,?,?)";		
			stmt=con.prepareStatement(query);
			stmt.setInt(1,item_id);
			stmt.setString(2,foodname);
			stmt.setDouble(3,foodprice);
			 n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Food Item added");	
			}
			else {
				System.out.println("Food Item Not added");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
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
		return n;
	}

	public int removeFoodItem(HotelBillingBean hotelBillingBean) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter food id");
		int item_id=sc.nextInt();
		sc.nextLine();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB?user=root&password=root");
			String query="delete from Hotel_Bill where Item_code=?";		
			stmt=con.prepareStatement(query);
			stmt.setLong(1,item_id);
			n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Food Item deleted");
				
			}
			else {
				System.out.println("Food Item Not deleted");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
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
		return n;
	}

	public int editFoodMenu(HotelBillingBean hotelBillingBean) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter food id");
		int item_id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter Food Item name");
		String foodname=sc.nextLine();

		System.out.println("enter Food price");
		double foodprice=sc.nextDouble();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB?user=root&password=root");
			String query="update Hotel_Bill set Item_code=?,Food_Name=?,price=? where Item_code=?";		
			stmt=con.prepareStatement(query);	
			stmt.setInt(1,item_id);
			stmt.setString(2,foodname);
			stmt.setDouble(3,foodprice);
			stmt.setInt(4,item_id);
			n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Food menu updated");
				
			}
			else {
				System.out.println("Food menu not updated");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
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
		return n;
	}

	public HotelBillingBean showAllFoodItems() {
		int n=0;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB?user=root&password=root");
			String query="select * from Hotel_Bill";		
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Item_Code |"+"Food_Name |"+"Price |");
			System.out.println("***************************************************************************");
			while(rs.next()) {
				int item_id=rs.getInt("Item_code");
				String foodname=rs.getString("Food_Name");
				double foodprice=rs.getDouble("price");
				System.out.println(item_id+" \t|"+foodname+"   \t|"+foodprice+"\t|");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
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
		return hotelBillingBean;
	}

	public double addOrder(int itemid) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB?user=root&password=root");
			String query="select price from Hotel_Bill where Item_code=?";		
			stmt=con.prepareStatement(query);
			stmt.setInt(1,itemid);
			rs=stmt.executeQuery();
			if(rs.next()) {
				this.totalBill =rs.getDouble("price");
			}
			else {
				System.out.println("no orders");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
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
		return totalBill;
	}
}
