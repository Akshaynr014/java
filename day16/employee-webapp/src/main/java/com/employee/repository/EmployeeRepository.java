package com.employee.repository;

import com.employee.dto.Employee;
import java.sql.*;

public class EmployeeRepository {
    private final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private final String USER = "root";
    private final String PASS = "akshay";

    public boolean insertEmployee(Employee emp) {
        boolean status = false;
        String sql = "INSERT INTO employee (name, email, department, salary) VALUES (?, ?, ?, ?)";

        try {
            // Explicitly load the MySQL JDBC driver (optional in newer versions, but safe)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            // Prepare statement
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            // Execute update and check result
            int rows = ps.executeUpdate();
            System.out.println("Inserted Rows: " + rows);
            status = rows > 0;

        } catch (Exception e) {
            System.out.println("🚨 Error inserting employee:");
            e.printStackTrace();
        }

        return status;
    }
}
