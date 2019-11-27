package com.manthan.collection;

import java.util.ArrayList;

import java.util.Iterator;

public class Testc {
	public static void main(String[] args) {
		
	ArrayList a=new ArrayList();
	a.add(5);
	a.add(2.4);
	a.add('f');
	a.add("simran");
	Iterator it=a.iterator();
	while(it.hasNext()) {
		Object o=it.next();
		System.out.println(o);
	}
	}
	
}
