package com.dyashincollection.map;

public class ImmutableMain {

	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass("akshay", 3);
		System.out.println(immutableClass.getName());
		System.out.println(immutableClass.getId());

	}

}
