package com.dyashincollection.map;

import java.util.TreeMap;

public class EmployeeMain {

	public static void main(String[] args) {
		TreeMap<Employe, Integer> treeMap = new TreeMap<>(new SortByID());
		treeMap.put(new Employe("akshay", 1, "Mysore"), 1);
		treeMap.put(new Employe("virat", 42, "banglor"), 2);
		treeMap.put(new Employe("rohit", 11, "Mandya"), 3);
		System.out.println(treeMap);
		
	}

}
