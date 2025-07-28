package com.dyashin.controller;



import java.io.IOException;
import java.util.List;

import com.dyashin.dao.Dao;
import com.dyashin.dao.DaoImpl;
import com.dyashin.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class ListEmployeesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Dao dao = new DaoImpl();
        List<Employee> employees = dao.getAllEmployees();

        request.setAttribute("employeeList", employees);
        request.getRequestDispatcher("listEmployees.jsp").forward(request, response);
    }
}



