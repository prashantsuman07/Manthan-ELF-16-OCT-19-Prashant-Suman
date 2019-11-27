package com.manthan.collection.Set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Testf {
public static void main(String[] args) {
		
		LinkedHashSet<Person> a=new LinkedHashSet<Person>();
		Person p1=new Person(1, "Divya", 1.7);
		Person p2=new Person(2, "Divyaa", 9.7);
		Person p3=new Person(3, "Divyaaa", 2.7);
		Person p4=new Person(4, "Divyaaaa", 1.7);
		
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		for(Person k:a) {
			System.out.println(k.id);
			System.out.println(k.name);
			System.out.println(k.height);
		}
		System.out.println("************************");
		Iterator<Person> it=a.iterator();
		{
			while(it.hasNext()) {
				Person k=it.next();
				System.out.println(k.id);
				System.out.println(k.name);
				System.out.println(k.height);
			}
		}
	}

}
