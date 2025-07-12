package com.dyashin.myjdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MySecondJDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		Statement st = null;
//		ResultSet rs = null;
		// Load the driver
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.cj.jdbc.Driver");

			// get the db connection via driver
			String dubl = "jdbc:mysql://localhost:3306/company?user=root&password=akshay";
			System.out.println("Connecting to DB using URL:" + dubl);
			conn = DriverManager.getConnection(dubl);

			// 3. Issue the SQL query via connection
//			String query = "select*from department";
			String query1 = "insert into department values (11,'virat','delhi')";
			st = conn.createStatement();
//			rs = st.executeQuery(query);
			int rs = st.executeUpdate(query1);

			// 4. Process the result returned by SQL

			System.out.println("Rows inserted: " + rs);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
