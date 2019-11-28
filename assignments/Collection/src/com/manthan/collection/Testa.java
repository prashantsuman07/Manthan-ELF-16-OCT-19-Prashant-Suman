package com.manthan.collection;

import java.util.ArrayList;
	
public class Testa {
	public static void main(String[] args) {
		
	ArrayList a=new ArrayList();
	a.add(5);
	a.add(2.4);
	a.add('f');
	a.add("simran");
	for(int i=0;i<a.size();i++) {
		Object o=a.get(i);
		System.out.println(o);
	}
	}
	
}
