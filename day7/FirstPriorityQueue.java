package com.dyashincollection.Queue;

import java.util.PriorityQueue;


public class FirstPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(1);
		pq.add(9);
		pq.add(9);
//		pq.offer(5);
//		pq.offer(6);
//		pq.offer(8);
//		System.out.println(pq.peek());
//		System.out.println(pq.peek());
//		System.out.println(pq.peek());
//		pq.poll();
		System.out.println(pq.element());
		System.out.println(pq);
//		for (Integer integer : pq) {
//			System.out.println(integer);
//		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}

}
