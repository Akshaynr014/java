package com.dyashincollection.map;

import java.util.TreeMap;

public class FirstTreeMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("virat", 1);
		tm.put("ABD", 2);
		tm.put("Surya", 3);
		tm.put("Surya", 3);
		System.out.println(tm);
		System.out.println(tm.descendingKeySet());
		
		for (String string : tm.keySet()) {
			System.out.println(string);
		}
	}
}
