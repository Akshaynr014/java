package com.dyashin.controller;


import java.io.IOException;

import com.dyashin.dao.Dao;
import com.dyashin.dao.DaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

       Dao dao = new DaoImpl();
        boolean deleted = dao.deleteEmployeeById(id);

        if (deleted) {
            response.getWriter().println("Employee deleted successfully.");
        } else {
            response.getWriter().println("Employee not found or could not be deleted.");
        }
    }
}

