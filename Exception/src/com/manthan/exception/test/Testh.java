package com.manthan.exception.test;

public class Testh {
	public static void main(String[] args) {
		AtmSim a=new AtmSim();
		System.out.println("trasaction started");
		try {
		a.verify(41000);
		}
		catch(DayLimitException de)
		{
			de.printStackTrace();
		}
		System.out.println("trasaction ended");
	}

}
