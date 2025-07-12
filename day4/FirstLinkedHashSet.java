package com.dyashincollectionfm.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstLinkedHashSet {

	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<>();
		 linkedHashSet.add("akshay");
		 linkedHashSet.add("virat");
		 linkedHashSet.add("rohit");
		 linkedHashSet.add("abd");
		 linkedHashSet.add("sachin");
		 linkedHashSet.add(null);
		 linkedHashSet.add(null);
		 linkedHashSet.add("msd");
		 System.out.println( linkedHashSet);

	}

}
