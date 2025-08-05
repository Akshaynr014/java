<%@ page import="java.util.List" %>
<%@ page import="com.dyashin.springmvc.dto.Employee" %>
<%
    List<Employee> employees = (List<Employee>) request.getAttribute("employeeList");
%>
<!DOCTYPE html>
<html>
<head>
    <title>All Employees</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 800px;
            margin: auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #333333;
            text-align: center;
            margin-bottom: 30px;
        }

        .no-data {
            color: #e63946;
            text-align: center;
            font-size: 18px;
            font-weight: bold;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #dddddd;
        }

        th {
            background-color: #0077b6;
            color: #ffffff;
        }

        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Employee List</h2>

    <% if (employees == null || employees.isEmpty()) { %>
        <div class="no-data">No employees found.</div>
    <% } else { %>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Salary</th>
            </tr>
            <% for (Employee emp : employees) { %>
                <tr>
                    <td><%= emp.getId() %></td>
                    <td><%= emp.getName() %></td>
                    <td><%= emp.getEmail() %></td>
                    <td>₹<%= emp.getSalary() %></td>
                </tr>
            <% } %>
        </table>
    <% } %>
</div>
</body>
</html>