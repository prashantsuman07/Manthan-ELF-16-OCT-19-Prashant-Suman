package com.manthan.flipkart.dao;

import com.manthan.flipkart.bean.UserBean;

public interface UserDao {
	public UserBean login(String email,String password);
	public boolean register(UserBean userBean);

}
