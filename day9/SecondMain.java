package com.dyashin.threads;

public class SecondMain {

	public static void main(String[] args) {
		SecondThread st = new SecondThread();
		st.start();
	//	st.start(); gives exception 
		st.run(5);
		st.setName("Multi Thread");
		st.setPriority(1);
		System.out.println("Thread Name:"+st.getName());
		System.out.println("Thread Priority:"+st.getPriority());
		System.out.println(st.getState());
		st.start();
		System.out.println(st.getState());
	}

}
