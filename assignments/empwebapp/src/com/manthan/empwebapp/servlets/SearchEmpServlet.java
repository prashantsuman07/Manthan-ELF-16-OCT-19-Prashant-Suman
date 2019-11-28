package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/searchEmp")
public class SearchEmpServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp1) throws ServletException, IOException {
	String empId=req.getParameter("empid");
	int EmpId=Integer.parseInt(empId);
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	try {
		//Driver driver=new Driver();
		//DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
		String query="select * from employee_info where emp_id= ?";
		stmt=con.prepareStatement(query);
		stmt.setInt(1,EmpId);
		rs=stmt.executeQuery();
		PrintWriter out=resp1.getWriter();
		out.print("<html>");
		out.print("<body>");
		if(rs.next()) {
			
			
			out.print("<h2>empid: " + EmpId+ " found <hr color='cyan'>");
			out.print("<br>name: "+ rs.getString("emp_name") );
			out.print("<br>age: "+ rs.getString("age") );
			out.print("<br>sal: "+ rs.getString("salary") );
			out.print("<br>desig: "+rs.getString("designation"));		
			out.print("<br>mobile: "+rs.getLong("mobile"));
	}
		else {
			out.print("<h2>empid: " + EmpId+ " Not found");
		}
		out.print("</body>");
		out.print("</html>");
		out.close();
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
	}
}
