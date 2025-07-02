package com.dyashincollection.map;

import java.util.HashMap;

public class FirstHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> hashMap = new HashMap<>();
		hashMap.put("apple", 14);
		hashMap.put("banana", 12);
		hashMap.put("mango", 18);
		hashMap.put("mango", 18);
	
		for (String string : hashMap.keySet()) {
			System.out.println(string);
		}
		System.out.println(hashMap.entrySet());
//	System.out.println(hashMap);
//	System.out.println(hashMap.get("apple"));
//	System.out.println(hashMap.keySet());//return in the form of set
	}

}
