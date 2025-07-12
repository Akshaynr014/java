package com.dyashin.threads;

public class Main {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		System.out.println(myThread.getState());
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("Main Thread");

		}

	}

}
