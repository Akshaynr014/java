<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.dyashin.springmvc.dto.Employee" %>

<!DOCTYPE html>
<html>
<head>
    <title>Search Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            margin: auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        form {
            display: flex;
            justify-content: center;
            gap: 10px;
            margin-bottom: 20px;
        }

        input[type="number"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 150px;
        }

        input[type="submit"] {
            background-color: #0077b6;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #005f8f;
        }

        .error {
            color: #d00000;
            text-align: center;
            font-weight: bold;
            margin-top: 10px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 12px;
            border-bottom: 1px solid #ccc;
            text-align: left;
        }

        th {
            background-color: #023e8a;
            color: white;
        }

        td {
            background-color: #e0e0e0;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Search Employee by ID</h2>

    <form action="./search" method="get">
        <input type="number" name="id" placeholder="Enter ID" required />
        <input type="submit" value="Search" />
    </form>

    <%
        String error = (String) request.getAttribute("error");
        Employee emp = (Employee) request.getAttribute("employee");
    %>

    <% if (error != null) { %>
        <div class="error"><%= error %></div>
    <% } else if (emp != null) { %>
        <h3>Employee Details</h3>
        <table>
            <tr><th>ID</th><td><%= emp.getId() %></td></tr>
            <tr><th>Name</th><td><%= emp.getName() %></td></tr>
            <tr><th>Email</th><td><%= emp.getEmail() %></td></tr>
            <tr><th>Salary</th><td>₹<%= emp.getSalary() %></td></tr>
        </table>
    <% } %>
</div>
</body>
</html>
