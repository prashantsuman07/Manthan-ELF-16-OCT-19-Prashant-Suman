package com.manthan.hotelBilling.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.manthan.hotelBilling.bean.HotelBillingBean;
import com.manthan.hotelBilling.dao.HotelBillingDao;
import com.manthan.hotelBilling.dao.HotelBillingDaoImpl;

public class HotelBillingMain {
	static double oneDayTotalBill=0;
	public static void main(String[] args) {
		HotelBillingBean hotelBillingBean=new HotelBillingBean();
		HotelBillingDao hotelBillingDao=new HotelBillingDaoImpl();
		ArrayList<Double> oneDayBill=new ArrayList<Double>();
		int input=0;
		String ch1;
		boolean eod=true;
		double totalBill=0;
		Scanner sc=new Scanner(System.in);
		while(eod) {
		System.out.println("Press 1 to show all food items");
		System.out.println("Press 2 to take order from customers");
		System.out.println("Press 3 to operate on food items");
		System.out.println("Press 4 to total bill of the day");
		System.out.println("enter your choice");
		input=sc.nextInt();
		switch(input){
			case 1:	hotelBillingDao.showAllFoodItems();
					break;
			case 2: System.out.println("Press item code to add item in order and 0 to end the order");
						while(true) {
							System.out.println("enter item code ");
							int itemid=sc.nextInt();
							sc.nextLine();
							if(itemid==0) {
								System.out.println("end of order");
								System.out.println("Total Bill"+totalBill);
								break;
							}
							totalBill += hotelBillingDao.addOrder(itemid);
							System.out.println("Total Bill"+totalBill);
					}
					break;
			case 3: System.out.println("Press A to add food item");
					System.out.println("Press B to remove food item");
					System.out.println("Press C to modify food item");
					System.out.println("enter your choice");
					ch1=sc.next();
					switch(ch1) {
					case "A": 	hotelBillingDao.addFoodItem(hotelBillingBean);
								break;
					case "B": 	System.out.println("enter item code to delete");
								hotelBillingDao.removeFoodItem(hotelBillingBean);
								break;
					case "C": 	hotelBillingDao.editFoodMenu(hotelBillingBean);
								break;
					default : break;
					}
					break;
			case 4:	oneDayTotalBill +=totalBill ;
					System.out.println(oneDayTotalBill);
			default : break;
			
		}	
				System.out.println("enter true or false to end");
				eod=sc.nextBoolean();
				if(eod==false) {
					System.out.println("come again");
					break;
				}
				
		}
	}
}
