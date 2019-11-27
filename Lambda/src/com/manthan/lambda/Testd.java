package com.manthan.lambda;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;




public class Testd implements Compo {
	public static void main(String[] args) {
	//Compo c=new Compo();
	TreeSet<Student> a=new TreeSet<Student>(cmp1);
	Student p1=new Student(1, "Divya", 1.7);
	Student p2=new Student(20, "Divyaa", 9.7);
	Student p3=new Student(3, "Divyaaa", 2.7);
	Student p4=new Student(4, "Divyaaaa", 1.7);
	
	a.add(p1);
	a.add(p2);
	a.add(p3);
	a.add(p4);

	for(Student k:a) {
		System.out.println(k.id);
		System.out.println(k.name);
		System.out.println(k.per);
		
	}
	System.out.println("************************");
	System.out.println("************************");
	
	
	}
}
