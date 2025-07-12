package com.dyashin.threads;

public class Display {
 public synchronized void doStaff(String str) {
	 for(int i = 0;i<10;i++) {
		 System.out.println("Welcome Home");
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println(str);
	 }
 }
}
