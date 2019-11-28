package com.manthan.collection.Set;

public class Person implements Comparable<Person> {
	 int id;
	 String name;
	 double height;
	public Person(int id, String name, double height) {
		
		this.id = id;
		this.name = name;
		this.height = height;
	}
	/*
	 * @Override public int compareTo(Person o) { if(this.id>o.id) { return 1; }
	 * else if(this.id<o.id) { return -1; } else { return 0; } }
	 */
	/*
	 * @Override public int compareTo(Person o) { if(this.height>o.height) { return
	 * 1; } else if(this.height<o.height) { return 1; } return 0; }
	 */
	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}
	
	 

}
