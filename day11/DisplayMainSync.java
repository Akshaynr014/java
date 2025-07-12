package com.dyashin.threads;

public class DisplayMainSync {

	public static void main(String[] args) {
		Display d1 = new Display();
		DisplayThread t = new DisplayThread(d1, "akshay");
		DisplayThread t1 = new DisplayThread(d1, "virat");
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		t.start();
		t1.start();

	}

}
