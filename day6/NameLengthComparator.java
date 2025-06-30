package com.dyashincollection.cursor;

import java.util.Comparator;

public class NameLengthComparator implements Comparator<CompatatorExSecond> {
    @Override
    public int compare(CompatatorExSecond o1, CompatatorExSecond o2) {
        return o1.name.length() - o2.name.length(); // ascending by name length
    }

}
