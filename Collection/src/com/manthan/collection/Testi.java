package com.manthan.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Testi {
	public static void main(String[] args) {

		ArrayList<Double> a=new ArrayList<Double>();
		a.add(2.4);
		a.add(5.8);
		a.add(3.6);
		a.add(4.1);
		ListIterator<Double> it=a.listIterator();
		while(it.hasNext()) {
			Double o=it.next();
			System.out.println(o);
		}
		System.out.println("*******************************");
		while(it.hasPrevious()) {
			Double o=it.previous();
			System.out.println(o);
		}
	}
}
