package com.manthan.empmanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AddEmp {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id");
		int empId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter emp name");
		String ename=sc.next();
		
		System.out.println("enter emp age");
		int age=sc.nextInt();
		
		System.out.println("enter emp sal");
		double sal=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("enter emp desig");
		String desig=sc.next();
		
		System.out.println("enter emp mobile");
		long mobile=sc.nextLong();
		
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			String query="insert into employee_info values(?,?,?,?,?,?)";		
			stmt=con.prepareStatement(query);
			stmt.setInt(1,empId);
			stmt.setString(2,ename);
			stmt.setInt(3,age);
			stmt.setDouble(4, sal);
			stmt.setString(5,desig);
			stmt.setLong(6,mobile);
			int n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("success");
			}
			else {
				System.out.println("failed");
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
	}//end of main
}//end of class