package com.manthan.empmanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

public class SearchEmp {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id and name:");
		int empId=sc.nextInt();
		String ename=sc.next();
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			String query="select * from employee_info where emp_id= ? and emp_name= '?'";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,empId);
			stmt.setString(2,ename);
			rs=stmt.executeQuery();
			if(rs.next()) {
				int empid=rs.getInt("emp_id");
				String name=rs.getString("emp_name");
				int age=rs.getInt("age");
				double salary=rs.getDouble("salary");
				String designation=rs.getString("designation");
				long mobile=rs.getLong("mobile");
				
				System.out.println("empid     "+empid);
				System.out.println("empname    "+name);
				System.out.println("empage     "+age);
				System.out.println("empsalary     "+salary);
				System.out.println("empdesig     "+designation);
				System.out.println("empmobile    "+mobile);
				System.out.println("****************************");
			
		}
			else {
				System.out.println("empid not found");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
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
		
	}//eom()
}//eoc
