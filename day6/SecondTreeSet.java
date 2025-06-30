package com.dyashincollectionfm.list;

import java.util.TreeSet;

public class SecondTreeSet {
	public static void main(String[] args) {
		//uses customSorting
		TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
		treeSet.add(90);
		treeSet.add(80);
		treeSet.add(70);
		treeSet.add(40);
		treeSet.add(50);
		treeSet.add(50);
		System.out.println(treeSet);
	}

}

