package com.manthan.exception.test;

public class Testc {
	public static void main(String[] args) {
		System.out.println("hello");
		String r=null;
		try {
		System.out.println(10/0);
		System.out.println("hi");
		System.out.println("have a good day");
		System.out.println(r.length());
		}
		catch(ArithmeticException a) {
			System.out.println("not gonna happen");
		}
		
		catch(NullPointerException a) {
			System.out.println("not gonna happen bro");
		}
		System.out.println("bye");
	}
}
