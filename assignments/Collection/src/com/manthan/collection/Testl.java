package com.manthan.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Testl {
	public static void main(String[] args) {

		Vector<Character> a=new Vector<Character>();
		a.add('a');
		a.add('p');
		a.add('p');
		a.add('l');
		a.add('e');
		for(int i=0;i<a.size();i++) {
			Character o=a.get(i);
			System.out.println(o);
		}
		System.out.println("********************");
		for(Character k:a) {
			System.out.println(k);
		}
		System.out.println("********************");
		Iterator<Character> it=a.iterator();
		while(it.hasNext()) {
			Character o=it.next();
			System.out.println(o);
		}
		System.out.println("********************");
		ListIterator<Character> lit=a.listIterator();
		while(lit.hasNext()) {
			Character o=lit.next();
			System.out.println(o);
		}
		System.out.println("*******************************");
		while(lit.hasPrevious()) {
			Character o=lit.previous();
			System.out.println(o);
		}
	}
}
