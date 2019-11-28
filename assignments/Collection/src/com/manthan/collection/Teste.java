package com.manthan.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Teste {
	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add(5);
		a.add(2.4);
		a.add('f');
		a.add("simran");
		ListIterator it=a.listIterator(a.size());
		while(it.hasPrevious()) {
			Object o=it.previous();
			System.out.println(o);
		}
		}
	}
