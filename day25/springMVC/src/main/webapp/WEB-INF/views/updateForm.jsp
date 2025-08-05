<%@ page import="com.dyashin.springmvc.dto.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("emp");
    String message = (String) request.getAttribute("message");
    String error = (String) request.getAttribute("error");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f8;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 500px;
            margin: auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        h2, h3 {
            text-align: center;
            color: #333333;
            margin-bottom: 20px;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        input[type="text"],
        input[type="email"],
        input[type="number"] {
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 6px;
        }

        input[type="submit"] {
            padding: 10px;
            font-size: 16px;
            background-color: #0077b6;
            color: #ffffff;
            border: none;
            border-radius: 6px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #005f8f;
        }

        .message {
            color: green;
            text-align: center;
            font-weight: bold;
        }

        .error {
            color: #d00000;
            text-align: center;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">

        <%-- Show success or error messages if any --%>
        <% if (message != null) { %>
            <p class="message"><%= message %></p>
        <% } %>
        <% if (error != null) { %>
            <p class="error"><%= error %></p>
        <% } %>

        <% if (emp == null) { %>
            <h2>Fetch Employee</h2>
            <form action="employee/fetchForUpdate" method="get">
                <label for="id">Enter Employee ID:</label>
                <input type="number" name="id" id="id" required>
                <input type="submit" value="Fetch">
            </form>
        <% } else { %>
            <h2>Edit Employee</h2>
            <form action="employee/update" method="post">

                <input type="hidden" name="id" value="<%= emp.getId() %>">

                <label for="name">Name:</label>
                <input type="text" id="name" name="name" value="<%= emp.getName() %>" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="<%= emp.getEmail() %>" required>

                <label for="salary">Salary:</label>
                <input type="number" id="salary" name="salary" value="<%= emp.getSalary() %>" step="0.01" required>

                <input type="submit" value="Update">
            </form>
        <% } %>
    </div>
</body>
</html>
