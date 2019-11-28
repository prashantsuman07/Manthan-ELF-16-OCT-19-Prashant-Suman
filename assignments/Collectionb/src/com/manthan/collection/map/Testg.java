package com.manthan.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Testg {

	public static void main(String[] args) {
		HashMap<Character,String> hm=new HashMap<Character,String>();
		hm.put('A', "apple");
		hm.put('B', "bat");
		hm.put('M', "man");
		hm.put('F', "fan");
		Set<Map.Entry<Character,String>>se=hm.entrySet();
		for(Map.Entry<Character,String> j:se) {
			System.out.println(j);
		}
		
	}

}


