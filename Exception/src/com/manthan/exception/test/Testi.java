package com.manthan.exception.test;

public class Testi {
	public static void main(String[] args) {
		AgeSim ag=new AgeSim();
		System.out.println("trasaction started");
		try {
		ag.verify(94);
		System.out.println("aaj party bhai dega");
		}
		catch(InvalidAgeException de)
		{
			de.printStackTrace();
		}
		System.out.println("trasaction ended");
	}
}
