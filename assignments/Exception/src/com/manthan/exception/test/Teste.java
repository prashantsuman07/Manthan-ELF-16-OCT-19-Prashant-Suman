package com.manthan.exception.test;

public class Teste {
	public static void main(String[] args) {
		System.out.println("main started");
		Paytm p=new Paytm();
		try {
			p.book();
		}
		catch(ArithmeticException a) {
			System.out.println("exp @main");
		}
		System.out.println("main ended");
	}

}
