package com.dyashincollection.map;

import java.util.Comparator;

public class SortByID implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}

}
