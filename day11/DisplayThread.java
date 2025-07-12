package com.dyashin.threads;

public class DisplayThread extends Thread {
Display d;
String name;

public DisplayThread(Display d, String name) {
	super();
	this.d = d;
	this.name = name;
}

@Override
	public void run() {
		d.doStaff(name);
	}
}
