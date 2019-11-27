package com.manthan.collection.Set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Testc {
	public static void main(String[] args) {
		
	LinkedHashSet a=new LinkedHashSet();
	a.add(5);
	a.add(2.4);
	a.add('f');
	a.add("simran");
	for(Object k:a) {
		System.out.println(k);
	}
	System.out.println("************************");
	Iterator it=a.iterator();
	{
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
	}
}
}
