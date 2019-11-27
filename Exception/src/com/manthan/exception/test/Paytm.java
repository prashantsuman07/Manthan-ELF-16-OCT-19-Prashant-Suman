package com.manthan.exception.test;

public class Paytm {
	void book() {
		System.out.println("book starterd");
		Irctc i=new Irctc();
		try {
			i.confirm();
		}
		catch(ArithmeticException a) {
			System.out.println("exception at book");
			throw a;
		}
		finally {
			System.out.println("booked");
			}
	}
}
