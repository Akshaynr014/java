package com.dyashincollectionfm.list;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		 if (o1 < o2) {
	            return 1;  // o1 comes after o2
	        } else if (o1 > o2) {
	            return -1; // o1 comes before o2
	        } else {
	            return 0;  // equal
	        }
		
	}

}
