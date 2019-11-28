package com.manthan.exception.test;

public class Testa {
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont divide by zero");
		}
		System.out.println("byee");
	}

}
