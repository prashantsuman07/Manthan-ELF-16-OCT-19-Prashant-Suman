package com.manthan.empmanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Updateemp {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		int rs=0;
		ResultSet rs1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id ");
		int empId=sc.nextInt();
		
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			
			String query="select * from employee_info where emp_id= ?";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,empId);
			rs1=stmt.executeQuery();
			if(rs1.next()) {
				System.out.println("found");
			
			}
			else {
				System.out.println("not found");
				return;
			}
			System.out.println("enter emp mobile ");
			long newmob=sc.nextLong();
			String query1="update employee_info set mobile=? where emp_id=?";
			stmt=con.prepareStatement(query1);
			stmt.setLong(1,newmob);
			stmt.setInt(2,empId);
			 rs=stmt.executeUpdate();
			if(rs>0) {
				System.out.println("updated");
			
		}
			else {
				System.out.println("not updated");
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
		
}
}
