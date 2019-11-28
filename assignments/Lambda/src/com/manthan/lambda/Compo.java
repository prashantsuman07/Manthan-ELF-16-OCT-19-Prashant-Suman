package com.manthan.lambda;

import java.util.Comparator;

public interface Compo {
	Comparator<Student>cmp=(o1,o2)->{
		Integer i=o1.id;
		Integer j=o2.id;
		return i.compareTo(j);
	};
	Comparator<Student>cmp1=(o1,o2)->{
		Double i=o1.per;
		Double j=o2.per;
		return i.compareTo(j);
	};
	
	Comparator<Student>cmp2=(o1,o2)->{
		
		return o1.name.compareTo(o2.name);
	};
}
