package com.manthan.collection.que;

import java.util.PriorityQueue;

public class Testb {
public static void main(String[] args) {
	PriorityQueue q=new PriorityQueue();
	q.add(4);
	q.add(7);
	q.add(8);
	q.add(1);
	
	for(Object k:q) {
		System.out.println(k);
	}
}
}
