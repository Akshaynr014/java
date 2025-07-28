<%@ page import="com.dyashin.dto.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("emp");
    if (emp == null) {
%>
    <h3 style="color:red;">Employee not found!</h3>
<%
    } else {
%>
    <h2>Employee Details</h2>
    <p><strong>ID:</strong> <%= emp.getId() %></p>
    <p><strong>Name:</strong> <%= emp.getName() %></p>
    <p><strong>Email:</strong> <%= emp.getEmail() %></p>
    <p><strong>Salary:</strong> <%= emp.getSalary() %></p>
<%
    }
%>
