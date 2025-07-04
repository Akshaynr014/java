package com.dyashin.threads;

public class SecondRunnable {
	public static void main(String[] args) {
		Runnable task = () -> System.out.println("Thread is running...");
          
		Thread thread = new Thread(task);
		thread.start();
	}
}
