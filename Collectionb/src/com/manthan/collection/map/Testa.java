package com.manthan.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Testa {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put( "abcd",2);
		hm.put("abcde",5);
		hm.put("abced",3);
		hm.put("abcfffd",1);
		Set<Map.Entry<String,Integer>>se=hm.entrySet();
		for(Map.Entry<String,Integer> j:se) {
			System.out.println(j);
		}
		
	}
}
