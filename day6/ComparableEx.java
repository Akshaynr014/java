package com.dyashincollection.cursor;

public class ComparableEx implements Comparable<ComparableEx>{

	 int id;
	 String name;
	 int marks;
	 
	public ComparableEx(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(ComparableEx s) {
		
		return this.marks - this.marks;
	}
	@Override
	public String toString() {
		return "ComparableEx [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	 
	}


