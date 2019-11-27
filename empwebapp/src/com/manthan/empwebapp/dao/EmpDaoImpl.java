package com.manthan.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.empwebapp.bean.EmpInfoBean;

public class EmpDaoImpl implements EmpDao{

	@Override
	public EmpInfoBean searchEmp(int empId) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		EmpInfoBean empinfobean=null;
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://myrdspras.c2cec0awclng.ap-south-1.rds.amazonaws.com:3306/elf_employee_db?user=rootroot&password=rootroot");
			String query="select * from employee_info where emp_id= ?";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,empId);
			rs=stmt.executeQuery();
		
			if(rs.next()) {
				empinfobean=new EmpInfoBean();
			
				empinfobean.setEmpid(rs.getInt("emp_id"));
				empinfobean.setEmpname(rs.getString("emp_name"));
				empinfobean.setAge(rs.getInt("age"));
				empinfobean.setSal(rs.getDouble("salary"));
				empinfobean.setDesig(rs.getString("designation"));
				empinfobean.setMobile(rs.getLong("mobile"));
				empinfobean.setPswd(rs.getString("pswd"));
				
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
		return empinfobean;
	}
	
	
	@Override
	public boolean addEmp(EmpInfoBean empInfoBean) {
		Connection con=null;
		PreparedStatement stmt=null;
		boolean isAdded=false;
		EmpInfoBean empinfobean=null;
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://myrdspras.c2cec0awclng.ap-south-1.rds.amazonaws.com:3306/elf_employee_db?user=rootroot&password=rootroot");
			String query="insert into employee_info values(?,?,?,?,?,?,?)";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,empInfoBean.getEmpid());
			stmt.setString(2,empInfoBean.getEmpname());
			stmt.setInt(3,empInfoBean.getAge());
			stmt.setDouble(4,empInfoBean.getSal());
			stmt.setString(5,empInfoBean.getDesig());
			stmt.setLong(6,empInfoBean.getMobile());
			stmt.setString(7,"abcd");
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


	@Override
	public EmpInfoBean login(int empId, String pswd) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		EmpInfoBean empinfobean=null;
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://myrdspras.c2cec0awclng.ap-south-1.rds.amazonaws.com:3306/elf_employee_db?user=rootroot&password=rootroot");
			String query="select * from employee_info where emp_id= ? and pswd=?";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,empId);
			stmt.setString(2,pswd);
			rs=stmt.executeQuery();
			if(rs.next()) {
				empinfobean=new EmpInfoBean();
			
				empinfobean.setEmpid(rs.getInt("emp_id"));
				empinfobean.setEmpname(rs.getString("emp_name"));
				empinfobean.setAge(rs.getInt("age"));
				empinfobean.setSal(rs.getDouble("salary"));
				empinfobean.setDesig(rs.getString("designation"));
				empinfobean.setMobile(rs.getLong("mobile"));
				empinfobean.setPswd(rs.getString("pswd"));
				
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
			return empinfobean;
		
	}


	
	@Override
	public boolean updates(int empId,long mobile) {
		Connection con=null;
		PreparedStatement stmt=null;
		boolean isupdated=false;
		EmpInfoBean empinfobean=null;
		
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://myrdspras.c2cec0awclng.ap-south-1.rds.amazonaws.com:3306/elf_employee_db?user=rootroot&password=rootroot");
			String query="update employee_info set mobile=? where emp_id=?";
			stmt=con.prepareStatement(query);
			stmt.setLong(1,mobile);
			stmt.setInt(2,empId);
			int n=stmt.executeUpdate();
			if(n>0) {
				isupdated=true;
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
		return isupdated;
	}
	


	@Override
	public boolean del(int empId) {
		Connection con=null;
		PreparedStatement stmt=null;
		boolean isdeleted=false;
		EmpInfoBean empinfobean=null;
		
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://myrdspras.c2cec0awclng.ap-south-1.rds.amazonaws.com:3306/elf_employee_db?user=rootroot&password=rootroot");
			String query="delete from employee_info where emp_id=?";
			stmt=con.prepareStatement(query);
			stmt.setInt(1,empId);
			int n=stmt.executeUpdate();
			if(n>0) {
				isdeleted=true;
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
		return isdeleted;
	}
	}


