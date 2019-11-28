package com.manthan.collection;

import java.util.ArrayList;

public class Testb {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(5);
		a.add(2.4);
		a.add('f');
		a.add("simran");
		for(Object k:a) {
			System.out.println(k);
		}
	}

}
