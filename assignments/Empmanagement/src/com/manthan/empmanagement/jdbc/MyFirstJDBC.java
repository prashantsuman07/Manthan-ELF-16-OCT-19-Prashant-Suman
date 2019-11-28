package com.manthan.empmanagement.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
	
		Connection con=null;
		Statement stmt=null;
		int rs1=0;
		ResultSet rs=null;
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			stmt=con.createStatement();
			rs1=stmt.executeUpdate("update employee_info set emp_name='maria' where emp_id=101");
			System.out.println(rs1+" row affected");
			rs=stmt.executeQuery("select * from employee_info");
			while(rs.next()) {
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
	}//main end		
	
}//class end
