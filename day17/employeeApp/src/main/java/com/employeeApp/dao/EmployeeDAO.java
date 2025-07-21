package com.employeeApp.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.employeeApp.model.Employee;

public class EmployeeDAO {
    private final String JDBC_URL = "jdbc:mysql://localhost:3306/employeeApp";
    private final String USER = "root";
    private final String PASS = "akshay";

    public void addEmployee(Employee emp) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);

            String sql = "INSERT INTO employee(name, email, salary) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getEmail());
            stmt.setDouble(3, emp.getSalary());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public Employee getEmployeeById(int id) {
            Employee emp = null;
            try {
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
                String sql = "SELECT * FROM employee WHERE id=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    emp = new Employee();
                    emp.setId(rs.getInt("id"));
                    emp.setName(rs.getString("name"));
                    emp.setEmail(rs.getString("email"));
                    emp.setSalary(rs.getDouble("salary"));
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return emp;
        
 
    }
        public boolean deleteEmployeeById(int id) {
            boolean result = false;
            try {
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
                String sql = "DELETE FROM employee WHERE id=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, id);

                int rowsAffected = stmt.executeUpdate();
                result = rowsAffected > 0;

                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
        public boolean updateEmployee(Employee emp) {
            boolean result = false;
            try {
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
                String sql = "UPDATE employee SET name=?, email=?, salary=? WHERE id=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, emp.getName());
                stmt.setString(2, emp.getEmail());
                stmt.setDouble(3, emp.getSalary());
                stmt.setInt(4, emp.getId());

                int rowsAffected = stmt.executeUpdate();
                result = rowsAffected > 0;

                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
        public List<Employee> getAllEmployees() {
            List<Employee> list = new ArrayList<>();
            try {
            	 Class.forName("com.mysql.cj.jdbc.Driver");
            	Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);

                String sql = "SELECT * FROM employee";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Employee emp = new Employee();
                    emp.setId(rs.getInt("id"));
                    emp.setName(rs.getString("name"));
                    emp.setEmail(rs.getString("email"));
                    emp.setSalary(rs.getDouble("salary"));
                    list.add(emp);
//                    System.out.println("Number of employees fetched: " + list.size());

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
            
        }

}
