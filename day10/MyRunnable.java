package com.dyashin.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}