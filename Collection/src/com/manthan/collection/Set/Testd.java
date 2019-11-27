package com.manthan.collection.Set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Testd {
	public static void main(String[] args) {
		
		LinkedHashSet<String> a=new LinkedHashSet<String>();
		a.add("dimran");
		a.add(null);
		a.add("fdsfasd");
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
