package com.manthan.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;




public class StuMap {
	public static void main(String[] args) {
		ArrayList<Student1>ss1=new ArrayList<Student1>();
		Student1 s1=new Student1(1,"abc", 80.0);
		Student1 s2=new Student1(2,"abcd", 81.0);
		Student1 s3=new Student1(3,"abcde", 82.0);
		Student1 s4=new Student1(4,"abcdef", 71.0);
		ss1.add(s1);
		ss1.add(s2);
		ss1.add(s3);
		ss1.add(s4);
		
		ArrayList<Student1>ss2=new ArrayList<Student1>();
		Student1 s5=new Student1(1,"abc", 80.0);
		Student1 s6=new Student1(2,"abcd", 81.0);
		Student1 s7=new Student1(3,"abcde", 82.0);
		Student1 s8=new Student1(4,"abcdef", 71.0);
		ss2.add(s5);
		ss2.add(s6);
		ss2.add(s7);
		ss2.add(s8);
		
		
		
		
		HashMap<String,ArrayList<Student1>> hm=new HashMap<String,ArrayList<Student1>>();
		hm.put("abcd",ss1);
		hm.put("abcde",ss2);
		 
		
		Set<Map.Entry<String,ArrayList<Student1>>>se=hm.entrySet();
		for(Map.Entry<String,ArrayList<Student1>> j:se) {
			String key=j.getKey();
			ArrayList<Student1>a1=j.getValue();
			for(Student1 r:a1) {
			System.out.println("name " +r.name);
			System.out.println("id "+r.id);
			System.out.println("per "+r.per);
			System.out.println("****************************");
		}
		
		}
	}

}
