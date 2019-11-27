package com.manthan.collection.set;

import java.util.Comparator;

public class StudentById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Integer i=o1.id;
		Integer j=o2.id;
		return i.compareTo(j);
		
	}
	

}
