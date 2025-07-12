package com.dyashin.threads;

public class SecondThread extends Thread {
	@Override
	public void run() {
		System.out.println("hello");
	}
	
	public void run(int a) {
		System.out.println("hd");
	}
	

}
