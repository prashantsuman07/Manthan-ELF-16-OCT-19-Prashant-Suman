package com.manthan.collection.list;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Testc {
	public static void main(String[] args) {
		Collection<Double> q=new ArrayList<Double>();
		q.add(3.7);
		q.add(7.7);
		q.add(8.8);
		q.add(1.6);
		
		/*
		 * for(Object k:q) { System.out.println(k); }
		 */
		//Collections.shuffle(q);
		Iterator<Double> it=q.iterator();
		while(it.hasNext()) {
			Double r=it.next();
			System.out.println(r);
		}
	}
}
