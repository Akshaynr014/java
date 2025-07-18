package com.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.employee.dto.Employee;
import com.employee.service.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
    private final EmployeeService service = new EmployeeService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Collect form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        // 2. Create Employee object
        Employee emp = new Employee(name, email, department, salary);

        // 3. Save using service
        boolean isSaved = service.register(emp);

        // 4. Show response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (isSaved) {
            out.println("<h1>Employee Registered Successfully!</h1>");
        } else {
            out.println("<h1>Failed to register employee!</h1>");
        }
    }
}
