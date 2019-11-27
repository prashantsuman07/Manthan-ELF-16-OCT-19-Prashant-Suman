package com.manthan.exception.test;

public class Irctc {
	void confirm() {
		System.out.println("confirm started");
		try {
			System.out.println(10/2);
			
		}
		catch(ArithmeticException a) {
			System.out.println("Exception at confuirm");
			throw a;
		}
		finally {
		System.out.println("confirmed");
		}
	}
}
