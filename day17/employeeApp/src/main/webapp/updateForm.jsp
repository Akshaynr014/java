<%@ page import="com.employeeApp.model.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("emp");
%>

<% if (emp != null) { %>
    <h2>Edit Employee</h2>
    <form action="UpdateEmployeeServlet" method="post">
        <input type="hidden" name="id" value="<%= emp.getId() %>">
        Name: <input type="text" name="name" value="<%= emp.getName() %>" required><br>
        Email: <input type="email" name="email" value="<%= emp.getEmail() %>" required><br>
        Salary: <input type="number" name="salary" value="<%= emp.getSalary() %>" step="0.01" required><br>
        <input type="submit" value="Update">
    </form>
<% } else { %>
    <h3>No employee found with that ID.</h3>
<% } %>
