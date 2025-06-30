package com.dyashincollection.cursor;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerMain {

	public static void main(String[] args) {
		ArrayList<Player> al = new ArrayList<>();
		al.add(new Player("Virat Kohli", 1, 37));
		al.add(new Player("Ms Dhoni", 7, 44));
		al.add(new Player("Kl Rahul", 3, 33));
		al.add(new Player("Abd", 2, 40));
		al.add(new Player("Sachin Tendulkar", 4, 50));
		al.add(new Player("Glenn Maxwel", 5, 37));
		al.add(new Player("Hardik Panday", 9, 31));
		al.add(new Player("Kane Williamson", 6, 37));
		al.add(new Player("Suresh Raina", 10, 39));
		al.add(new Player("Rajat Patidar", 8, 31));
		
		System.out.println("using ranking comparable");
		System.out.println();
		Collections.sort(al);
		for (Player player : al) {
			System.out.println(player);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		System.out.println("using name Comparator");
		System.out.println();
		Collections.sort(al,new PlayerComparator());
		for (Player player : al) {
			System.out.println(player);
		}
	}

}
