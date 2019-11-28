package com.manthan.collection.map;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Testc {
	public static void main(String[] args) {
		Hashtable<Character,String> hm=new Hashtable<Character,String>();
		hm.put('s', "abcd");
		hm.put('a', "abcde");
		hm.put('c', "abced");
		hm.put('@', "abcfffd");
		Set<Map.Entry<Character,String>>se=hm.entrySet();
		for(Map.Entry<Character,String> j:se) {
			System.out.println(j);
		}
		
	}
}
