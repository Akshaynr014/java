package com.employeeApp.controller;


import com.employeeApp.dao.EmployeeDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class DeleteEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        EmployeeDAO dao = new EmployeeDAO();
        boolean deleted = dao.deleteEmployeeById(id);

        if (deleted) {
            response.getWriter().println("Employee deleted successfully.");
        } else {
            response.getWriter().println("Employee not found or could not be deleted.");
        }
    }
}

