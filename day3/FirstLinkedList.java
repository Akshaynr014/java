package com.dyashincollectionfm.list;

import java.util.LinkedList;

public class FirstLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("akshay");
		ll.add("virat");
		ll.add("rohith");
		ll.add("klr");
		ll.add("abd");
		ll.add("abd");
		ll.addFirst("sachin");
		ll.remove(0);
		
		System.out.println(ll.removeLast());
		for (String string : ll) {
			System.out.println(string);
		}
		System.out.println(ll.size());
		System.out.println(ll.get(0));
		System.out.println( ll.contains("sachin"));
		System.out.println(ll.reversed());
		
	}

}
