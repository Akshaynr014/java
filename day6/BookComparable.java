package com.dyashincollection.cursor;

public class BookComparable implements Comparable<BookComparable> {
String title;

	public BookComparable(String title) {
	super();
	this.title = title;
}

	@Override
	public int compareTo(BookComparable o) {
		
		return this.title.compareTo(o.title);
	}

	@Override
	public String toString() {
		return "BookComparable [title=" + title + "]";
	}

}
