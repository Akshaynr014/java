<!DOCTYPE html>
<html>
<head><title>Add Employee</title></head>
<body>
    <h2>Add New Employee</h2>
    <form action="AddEmployeeServlet" method="post">
        Name: <input type="text" name="name" required><br>
        Email: <input type="email" name="email" required><br>
        Salary: <input type="number" name="salary" required><br>
        <input type="submit" value="Add">
    </form>
</body>
</html>
