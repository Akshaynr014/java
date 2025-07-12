package com.dyashincollection.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumVector {
public static void main(String[] args) {
	Vector<Integer> vector = new Vector<>();
	for(int i=0;i<9;i++) {
		vector.add(i);
	}
	Enumeration<Integer> enums = vector.elements();
	while (enums.hasMoreElements()) {
		Integer no = (Integer) enums.nextElement();
		if (no%2==0) {
			System.out.println(no);
		}
		
	}
}
}
