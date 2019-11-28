package com.manthan.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Testb {
	public static void main(String[] args) {
		
		HashSet<String> a=new HashSet<String>();
		a.add("dimran");
		Boolean b=a.add("dimran");
		System.out.println(b);
		a.add(null);
		a.add("simran");
		for(String k:a) {
			System.out.println(k);
		}
		System.out.println("************************");
		Iterator<String> it=a.iterator();
		{
			while(it.hasNext()) {
				String r=it.next();
				System.out.println(r);
			}
		}
	}
}
