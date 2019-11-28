package com.manthan.array.test;

public class Testf {
	public static void main(String[] args) {
		Student[] s=new Student[4];
		Student s3=new Student("simran", 1, 0.0);
		Student s1=new Student("simran1", 2, 2.0);
		Student s2=new Student("simran2", 3, 6.0);
		s[0]=s3;
		s[1]=s1;
		s[2]=s2;
		for(Student k:s) {
			System.out.println(k.name);
			System.out.println(k.id);
			System.out.println(k.percentange);
			
		}
	}
}
