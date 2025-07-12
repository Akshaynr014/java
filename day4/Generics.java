package com.dyashincollectionfm.list;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		List<Object> al = new ArrayList<>();  //typeSafty-generics
		al.add(1);
		al.add("akshay");
		al.add(2);
		al.add(2);
		
		for (Object object : al) {
			System.out.println(object);	
		}
		
	

	}

}
