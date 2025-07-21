<%@ page import="com.employeeApp.model.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("emp");
%>

<% if (emp != null) { %>
    <h2>Employee Details</h2>
    <p>ID: <%= emp.getId() %></p>
    <p>Name: <%= emp.getName() %></p>
    <p>Email: <%= emp.getEmail() %></p>
    <p>Salary: <%= emp.getSalary() %></p>
<% } else { %>
    <h2>No employee found with the given ID.</h2>
<% } %>
