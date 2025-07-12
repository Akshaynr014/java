package com.dyashin.myjdbcapp.abstraction1;

public class MainMathod {

	public static void main(String[] args) {
		String dburl = "A";
		Connection conn=DriverManager.getConnection(dburl);
		Statement stmt = conn.createStatement();
		stmt.doStaff();

	}

}
