package com.manthan.collection.map;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Teste {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put( 2,"abcd");
		hm.put(5,"abcde");
		hm.put(3,"abcedd");
		hm.put(1,"abcedddd");
		Set<Map.Entry<Integer,String>>se=hm.entrySet();
		for(Map.Entry<Integer,String> j:se) {
			System.out.println(j);
		}
		
	}
}
