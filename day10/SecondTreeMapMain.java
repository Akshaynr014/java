package com.dyashincollection.map;

import java.util.TreeMap;

public class SecondTreeMapMain {

	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<>(new SecondTreeMap());
		treeMap.put("virat", 1);
		treeMap.put("Rohit", 2);
		treeMap.put("KL Rahul", 8);
		treeMap.put("Surya", 5);
		treeMap.put("ABD", 7);
		System.out.println(treeMap);
		

	}

}
