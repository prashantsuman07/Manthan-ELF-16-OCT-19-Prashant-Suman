package com.manthan.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Testh {
	public static void main(String[] args) {

		ArrayList<Double> a=new ArrayList<Double>();
		a.add(2.4);
		a.add(5.8);
		a.add(3.6);
		a.add(4.1);
		Iterator<Double> it=a.iterator();
		while(it.hasNext()) {
			Double o=it.next();
			System.out.println(o);
		}
	}
}
