package com.manthan.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Testm {
	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
		Student s1=new Student(1,"abc", 80.0);
		Student s2=new Student(2,"abcd", 81.0);
		Student s3=new Student(3,"abcde", 82.0);
		Student s4=new Student(4,"abcdef", 71.0);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		for(int i=0;i<a.size();i++) {
			Student o=a.get(i);
			System.out.println(o.id);
			System.out.println(o.name);
			System.out.println(o.per);
			System.out.println("**************************");
		}
		for(Student o:a) {
			System.out.println(o.id);
			System.out.println(o.name);
			System.out.println(o.per);
			System.out.println("**************************");
		}
		Iterator<Student> it=a.iterator();
		while(it.hasNext()) {
			Student o=it.next();
			System.out.println(o.id);
			System.out.println(o.name);
			System.out.println(o.per);
			System.out.println("**************************");
		}
	}

}
