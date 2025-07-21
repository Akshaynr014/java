package com.employeeApp.controller;



import com.employeeApp.dao.EmployeeDAO;
import com.employeeApp.model.Employee;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;



public class ListEmployeesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> employees = dao.getAllEmployees();

        request.setAttribute("employeeList", employees);
        request.getRequestDispatcher("listEmployees.jsp").forward(request, response);
    }
}



