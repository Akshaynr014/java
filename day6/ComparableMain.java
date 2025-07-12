package com.dyashincollection.cursor;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

	public static void main(String[] args) {
		ArrayList<ComparableEx> al = new ArrayList<>();
		al.add(new ComparableEx(1, "akshay", 92));
		al.add(new ComparableEx(2, "virat", 95));
		al.add(new ComparableEx(3, "rohit", 82));
		al.add(new ComparableEx(4, "abd", 90));

		Collections.sort(al);
		System.out.println("sorted marks are:");
		for (ComparableEx comparableEx : al) {
			System.out.println(comparableEx);
		}
		
		ArrayList<ComparableExSecond> al2 = new ArrayList<>();
		al2.add(new ComparableExSecond("phone", 10000));
		al2.add(new ComparableExSecond("laptop", 80000));
		al2.add(new ComparableExSecond("tv", 50000));
		Collections.sort(al2);
		for (ComparableExSecond comparableExSecond : al2) {
			System.out.println(comparableExSecond);
		}
		
		ArrayList<BookComparable> al3 = new ArrayList<>();
		al3.add(new BookComparable("java"));
		al3.add(new BookComparable("python"));
		al3.add(new BookComparable("ruby"));
		al3.add(new BookComparable("ecmaScript"));
		Collections.sort(al3);
		for (BookComparable bookComparable : al3) {
			System.out.println(bookComparable);
		}
		
	}

}
