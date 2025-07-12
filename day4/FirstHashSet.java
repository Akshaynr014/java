package com.dyashincollectionfm.list;

import java.util.HashSet;

public class FirstHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Mysuru");
		hashSet.add("Mandya");
		hashSet.add("Hassan");
		hashSet.add("Bangaluru");
		hashSet.add("Mangaluru");
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);

	}

}
