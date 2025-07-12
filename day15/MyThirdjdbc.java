package com.dyashin.myjdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyThirdjdbc {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// Load the driver
		try {
//			
			Class.forName("com.mysql.cj.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/company?user=root&password=akshay";
			System.out.println("Connecting to DB using URL: " + dburl);
			conn = DriverManager.getConnection(dburl);

			String query = "SELECT * FROM employee where id =?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
//			pstmt.setInt(2,Integer.parseInt(args[1]));

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double salary = rs.getDouble("salary");
				long phoneNumber = rs.getLong("phone_number");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String email = rs.getString("email_id");
				String adhar = rs.getString("adharnum");
				Date joiningDate = rs.getDate("date_of_joining");
				int marriageStatus = rs.getInt("marriage_status");

				// Print the result
				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Salary: " + salary);
				System.out.println("Phone Number: " + phoneNumber);
				System.out.println("Age: " + age);
				System.out.println("Gender: " + gender);
				System.out.println("Email ID: " + email);
				System.out.println("Adhar Number: " + adhar);
				System.out.println("Date of Joining: " + joiningDate);
				System.out.println("Marriage Status: " + (marriageStatus == 1 ? "Married" : "Single"));
				System.out.println("---------------------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}