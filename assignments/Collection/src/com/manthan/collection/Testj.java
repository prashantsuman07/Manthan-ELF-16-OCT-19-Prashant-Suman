package com.manthan.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Testj {
	public static void main(String[] args) {

		LinkedList a=new LinkedList();
		a.add(5);
		a.add(2.4);
		a.add('f');
		a.add("simran");
		for(int i=0;i<a.size();i++) {
			Object o=a.get(i);
			System.out.println(o);
		}
		System.out.println("********************");
		for(Object k:a) {
			System.out.println(k);
		}
		System.out.println("********************");
		Iterator it=a.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
		System.out.println("********************");
		ListIterator lit=a.listIterator();
		while(lit.hasNext()) {
			Object o=lit.next();
			System.out.println(o);
		}
		System.out.println("*******************************");
		while(lit.hasPrevious()) {
			Object o=lit.previous();
			System.out.println(o);
		}
	}
}
