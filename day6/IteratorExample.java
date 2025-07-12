package com.dyashincollection.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("akshay");
		al.add("virat Lohli");
		al.add("kl Rahul");
		al.add("RCB");
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String name = it.next();
			if(name.equals("RCB")) {
				it.remove();
			}else {
			System.out.println(name);
		}
		
	}
}
}