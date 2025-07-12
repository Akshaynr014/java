package com.dyashin.threads;

public class TestRunnable {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread th = new Thread(myRunnable);
		th.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
