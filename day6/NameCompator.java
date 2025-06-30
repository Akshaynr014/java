package com.dyashincollection.cursor;

import java.util.Comparator;

class NameComparator implements Comparator<ComparableEx> {
	    public int compare(ComparableEx s1, ComparableEx s2) {
	        return s1.name.compareTo(s2.name);
	    }
	}


