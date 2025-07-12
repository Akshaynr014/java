package com.dyashincollection.cursor;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {
	public static void main(String[] args) {
		ArrayList<ComparableEx> al = new ArrayList<>();
		al.add(new ComparableEx(1, "akshay", 92));
		al.add(new ComparableEx(2, "virat", 95));
		al.add(new ComparableEx(3, "rohit", 82));
		al.add(new ComparableEx(4, "abd", 90));

		Collections.sort(al, new NameComparator());
		for (ComparableEx comparatorEx : al) {
			System.out.println(comparatorEx);
		}

		ArrayList<CompatatorExSecond> al2 = new ArrayList<>();
		al2.add(new CompatatorExSecond("phone", 10000));
		al2.add(new CompatatorExSecond("laptop", 80000));
		al2.add(new CompatatorExSecond("tv", 50000));

		Collections.sort(al2, new NameLengthComparator());
		for (CompatatorExSecond compatatorExSecond : al2) {
			System.out.println(compatatorExSecond);
		}
		
		ArrayList<BookComparable> al3 = new ArrayList<>();
		al3.add(new BookComparable("java"));
		al3.add(new BookComparable("python"));
		al3.add(new BookComparable("ruby"));
		al3.add(new BookComparable("ecmaScript"));
		
		Collections.sort(al3,new BookComparatorThird());
		for (BookComparable bookComparable : al3) {
			System.out.println(bookComparable);
		}
	}
}
