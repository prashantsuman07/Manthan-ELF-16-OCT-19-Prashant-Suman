package com.manthan.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Testk {
	public static void main(String[] args) {

		LinkedList<String> a=new LinkedList<String>();
		a.add("mimran");
		a.add("dimran");
		a.add("kimran");
		a.add("simran");
		for(int i=0;i<a.size();i++) {
			String o=a.get(i);
			System.out.println(o);
		}
		System.out.println("********************");
		for(String k:a) {
			System.out.println(k);
		}
		System.out.println("********************");
		Iterator<String> it=a.iterator();
		while(it.hasNext()) {
			String o=it.next();
			System.out.println(o);
		}
		System.out.println("********************");
		ListIterator<String> lit=a.listIterator();
		while(lit.hasNext()) {
			String o=lit.next();
			System.out.println(o);
		}
		System.out.println("*******************************");
		while(lit.hasPrevious()) {
			String o=lit.previous();
			System.out.println(o);
		}
	}
}
