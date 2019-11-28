package com.manthan.empwebapp.util;

import com.manthan.empwebapp.dao.EmpDao;
import com.manthan.empwebapp.dao.EmpDaoImpl;

public class EmpDaoMgr {
	private EmpDaoMgr() {
		
	}
	public static EmpDao getDaoIns() {
		return new EmpDaoImpl();
	}
}
