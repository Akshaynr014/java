package com.dyashincollection.Queue;

import java.util.ArrayDeque;

public class FirstArrayQueue {

	public static void main(String[] args) {
		ArrayDeque<String> aq = new ArrayDeque<>(0);
		aq.addFirst("akshay");
		aq.addLast("kohli");
		aq.offerFirst("virat");
		aq.offerLast("kl");
		System.out.println(aq);
		String firstRemove=aq.removeFirst();
		String LastRemove=aq.removeLast();                                
		System.out.println(firstRemove);
		System.out.println(LastRemove);
		
		System.out.println(aq.getFirst());
		System.out.println(aq.getLast());
		System.out.println(aq);
		

	}

}
