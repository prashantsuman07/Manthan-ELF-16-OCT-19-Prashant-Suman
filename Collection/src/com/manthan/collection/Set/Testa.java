package com.manthan.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Testa {
	public static void main(String[] args) {
		
	HashSet a=new HashSet();
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