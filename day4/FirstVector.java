package com.dyashincollectionfm.list;

import java.util.Vector;

public class FirstVector {
public static void main(String[] args) {
	Vector<Integer> vector = new Vector<>();
	for (int i=0;i<10;i++) {
		vector.addElement(i);
	}
	System.out.println(vector);
	System.out.println(vector.capacity());
}

}
