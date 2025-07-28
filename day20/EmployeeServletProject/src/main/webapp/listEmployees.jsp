<%@ page import="java.util.List" %>
<%@ page import="com.dyashin.dto.Employee" %>
<%
    List<Employee> employees = (List<Employee>) request.getAttribute("employeeList");
%>

<!DOCTYPE html>
<html>
<head>
    <title>All Employees</title>
</head>
<body>
<h2>Employee List</h2>

<% if (employees == null || employees.isEmpty()) { %>
    <p style="color:red;">No employees found.</p>
<% } else { %>
    <table border="1">
        <tr>
            <th>ID</th><th>Name</th><th>Email</th><th>Salary</th>
        </tr>
        <% for (Employee emp : employees) { %>
            <tr>
                <td><%= emp.getId() %></td>
                <td><%= emp.getName() %></td>
                <td><%= emp.getEmail() %></td>
                <td><%= emp.getSalary() %></td>
            </tr>
        <% } %>
    </table>
<% } %>
</body>
</html>
