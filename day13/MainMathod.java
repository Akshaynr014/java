package com.dyashin.myjdbcapp.abstraction;

public class MainMathod {

	public static void main(String[] args) {
		String dburl = "A";
		Connection test=DriverManager.getConnection(dburl);
		test.createStatement();

	}

}
