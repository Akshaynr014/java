package com.dyashincollection.cursor;

import java.util.Comparator;

public class BookComparatorThird implements Comparator<BookComparable>{

	@Override
	public int compare(BookComparable o1, BookComparable o2) {
		
		return o1.title.compareTo(o2.title);
	}

}
