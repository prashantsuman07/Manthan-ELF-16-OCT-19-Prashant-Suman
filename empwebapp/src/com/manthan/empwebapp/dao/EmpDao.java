package com.manthan.empwebapp.dao;

import java.util.ArrayList;

import com.manthan.empwebapp.bean.EmpInfoBean;

public interface EmpDao {
	public EmpInfoBean searchEmp(int empId);
	public boolean addEmp(EmpInfoBean empInfoBean);
	public boolean updates(int empId,long mobile);
	public boolean del(int empId);
	public EmpInfoBean login(int empId,String pswd);
	//public ArrayList<EmpInfoBean> seeall();
}//end of dao
