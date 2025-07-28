package com.dyashin.controller;

import java.io.IOException;

import com.dyashin.dao.Dao;
import com.dyashin.dao.DaoImpl;
import com.dyashin.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        double salary = Double.parseDouble(request.getParameter("salary"));

        // ✅ Use no-arg constructor + setters
        Employee emp = new Employee();
        emp.setId(id);
        emp.setName(name);
        emp.setEmail(email);
        emp.setSalary(salary);

        Dao dao = new DaoImpl();
        boolean updated = dao.updateEmployee(emp);

        if (updated) {
            response.getWriter().println("Employee updated successfully.");
        } else {
            response.getWriter().println("Update failed.");
        }
    }
}


