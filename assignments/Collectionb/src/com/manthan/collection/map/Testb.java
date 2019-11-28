package com.manthan.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;

public class Testb {
	public static void main(String[] args) {
		LinkedHashMap<Character,String> hm=new LinkedHashMap<Character,String>();
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
