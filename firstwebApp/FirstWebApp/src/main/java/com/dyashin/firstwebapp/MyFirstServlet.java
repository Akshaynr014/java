package com.dyashin.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String currentDateTime = new Date().toString(); // ✅ Use java.util.Date
		String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=\"ISO-8859-1\">"
				+ "<title>My First HTML</title>" + "</head>" + "<body>" + "<h1>" + "Current date and time:<br>"
				+ "<span style=\"color:blue\">" + currentDateTime + "</span>" + "</h1>" + "</body>" + "</html>";

		response.setContentType("text/html");
		response.setHeader("Refresh", "1");
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
	}
}
