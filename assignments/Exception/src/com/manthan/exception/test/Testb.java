package com.manthan.exception.test;

public class Testb {
	public static void main(String[] args) {
		System.out.println("hello");
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException nw) {
			System.out.println("dont deal with null");
		}
		System.out.println("bye");
	}
}
