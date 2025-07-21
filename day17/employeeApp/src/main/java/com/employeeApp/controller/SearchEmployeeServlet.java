package com.employeeApp.controller;



import java.io.IOException;

import com.employeeApp.dao.EmployeeDAO;
import com.employeeApp.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchEmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        EmployeeDAO dao = new EmployeeDAO();
        Employee emp = dao.getEmployeeById(id);

        request.setAttribute("emp", emp);
        RequestDispatcher rd = request.getRequestDispatcher("displayEmployee.jsp");
        rd.forward(request, response);
    }
}
