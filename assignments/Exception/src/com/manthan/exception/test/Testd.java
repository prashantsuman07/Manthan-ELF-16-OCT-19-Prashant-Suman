package com.manthan.exception.test;

public class Testd {
	public static void main(String[] args) {
		int a[]=new int[3];
		System.out.println("hello");
		String r=null;
		try {
		System.out.println(a[6]);
		System.out.println(10/0);
		System.out.println("hi");
		System.out.println("have a good day");
		System.out.println(r.length());
		}
		catch(ArithmeticException b) {
			System.out.println("not gonna happen");
		}
		
		catch(NullPointerException b) {
			System.out.println("not gonna happen bro");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("out of limits");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("byeeS");
	}

}
