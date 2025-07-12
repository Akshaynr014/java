package com.dyashin.myjdbcapp.abstraction1;

public class DriverManager {

	private DriverManager() {
	}
	
	public static Connection getConnection(String str) {
		Connection test = null;
		if(str.equals("A")) {
			test = new ClassA();
		}else {
			test = new ClassB();
		}
		return test;
	}

}
