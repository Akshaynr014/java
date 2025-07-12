package com.dyashincollection.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class ItrArrayList {
public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	for(int i=0;i<10;i++) {
		arrayList.add(i);
}
	Iterator<Integer> itr = arrayList.iterator();
	while(itr.hasNext()) {
		Integer integer = (Integer)itr.next();
		if (integer%2==0) {
			System.out.println(integer);
		}else {
			itr.remove();
		}
	}
}
}
