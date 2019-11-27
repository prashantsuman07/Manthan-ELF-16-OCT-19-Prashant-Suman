package com.manthan.array.test;

public class Testg {
	public static void main(String[] args) {
		Demo d=new Demo();
		int[] x= {1,2,3,4,5};
		d.eat(x);
		double[] y=d.getMe();
		for(double k:y) {
			System.out.println(k);
		}
	}
}
