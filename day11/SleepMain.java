package com.dyashin.threads;

public class SleepMain {
	public static void main(String[] args) {
		SleepThread myThread = new SleepThread();

		System.out.println(myThread.getState());
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread");

		}
	}
}
