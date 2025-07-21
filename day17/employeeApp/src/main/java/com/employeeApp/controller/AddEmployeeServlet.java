package com.employeeApp.controller;



import java.io.IOException;

import com.employeeApp.dao.EmployeeDAO;
import com.employeeApp.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmail(email);
        emp.setSalary(salary);

        EmployeeDAO dao = new EmployeeDAO();
        dao.addEmployee(emp);

        response.sendRedirect("index.jsp");
    }
}

