package com.dyashincollection.cursor;

public class ComparableExSecond implements Comparable<ComparableExSecond> {
    String name;
    double price;

    public ComparableExSecond(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(ComparableExSecond p) {
        return Double.compare(this.price, p.price);
    }

    public String toString() {
        return name + " : ₹" + price;
    }

}
