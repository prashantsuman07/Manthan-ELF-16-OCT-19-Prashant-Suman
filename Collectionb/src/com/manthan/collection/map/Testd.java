package com.manthan.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Testd {
	public static void main(String[] args) {
		HashMap<Character,String> hm=new HashMap<Character,String>();
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
