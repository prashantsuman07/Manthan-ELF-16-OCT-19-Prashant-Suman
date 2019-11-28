package com.manthan.collection.set;

import java.util.Iterator;
import java.util.TreeSet;


public class Test {
	public static void main(String[] args) {
		Student p1=new Student(1, "Divya", 1.7);
		Student p2=new Student(20, "Divyaa", 9.7);
		Student p3=new Student(3, "Divyaaa", 2.7);
		Student p4=new Student(4, "Divyaaaa", 1.7);
		StudentById s=new  StudentById();
		StudentByName s1=new  StudentByName();
	
	TreeSet<Student> a=new TreeSet<Student>(s1);

	
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		Iterator<Student>i=a.iterator();
		while(i.hasNext()) {
			Student e=i.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.per);
			
		}

}
}