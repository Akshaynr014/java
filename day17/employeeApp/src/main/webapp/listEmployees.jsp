<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.employeeApp.model.Employee" %>

<!DOCTYPE html>
<html>
<head>
    <title>List of Employees</title>
</head>
<body>
    <h2>All Employees</h2>

    <%
        List<Employee> list = (List<Employee>) request.getAttribute("employeeList");

        // ✅ Optional: Debug line (can be removed in production)
        if (list == null) {
            out.println("<p style='color:red;'>⚠ No data received. Make sure you accessed this page via the /list servlet.</p>");
        }
    %>

    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th><th>Name</th><th>Email</th><th>Salary</th>
        </tr>

        <%
            if (list != null && !list.isEmpty()) {
                for (Employee emp : list) {
        %>
        <tr>
            <td><%= emp.getId() %></td>
            <td><%= emp.getName() %></td>
            <td><%= emp.getEmail() %></td>
            <td><%= emp.getSalary() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="4">No Employees Found</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
