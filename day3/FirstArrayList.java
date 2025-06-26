package com.dyashincollectionfm.list;

import java.util.ArrayList;
import java.util.List;

public class FirstArrayList {

	public static void main(String[] args) {
		List<Object> al = new ArrayList<>();//upcasting to list
		al.add(1);
		al.add("akshay");
		al.add(2);
		al.add(2);
		
		for (Object object : al) {
			System.out.println(object);	
		}
		System.out.println(al.get(1));
		System.out.println(al.contains(0));
		System.out.println(al.remove(1));
		System.out.println(al.contains("akshay"));
	
	}

}
