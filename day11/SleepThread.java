package com.dyashin.threads;

public class SleepThread  extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		//	Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Thread inside run method");
		
		}

}
}