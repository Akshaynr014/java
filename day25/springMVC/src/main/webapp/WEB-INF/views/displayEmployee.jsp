<%@ page import="com.dyashin.springmvc.dto.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("employee");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            margin: auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #333333;
            border-bottom: 2px solid #ccc;
            padding-bottom: 10px;
        }

        p {
            font-size: 16px;
            color: #555555;
            margin: 10px 0;
        }

        strong {
            color: #222222;
        }

        .not-found {
            color: #ff4d4d;
            text-align: center;
            font-size: 18px;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container">
    <% if (emp == null) { %>
        <div class="not-found">Employee not found!</div>
    <% } else { %>
        <h2>Employee Details</h2>
        <p><strong>ID:</strong> <%= emp.getId() %></p>
        <p><strong>Name:</strong> <%= emp.getName() %></p>
        <p><strong>Email:</strong> <%= emp.getEmail() %></p>
        <p><strong>Salary:</strong> ₹<%= emp.getSalary() %></p>
    <% } %>
</div>

</body>
</html>
