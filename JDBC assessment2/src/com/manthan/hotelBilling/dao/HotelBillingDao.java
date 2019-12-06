package com.manthan.hotelBilling.dao;

import com.manthan.hotelBilling.bean.HotelBillingBean;

public interface HotelBillingDao {
	public int addFoodItem(HotelBillingBean hbb);
	public int removeFoodItem(HotelBillingBean hbb);
	public int editFoodMenu(HotelBillingBean hbb);
	public HotelBillingBean showAllFoodItems(); 
	public double addOrder(int itemid);
}
