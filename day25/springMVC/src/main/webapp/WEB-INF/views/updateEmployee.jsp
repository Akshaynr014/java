<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Update Employee</title>
    <style>
        body { font-family: Arial; background: #eef2f7; padding: 20px; }
        form { background: #fff; padding: 20px; width: 400px; margin: auto; border-radius: 10px; box-shadow: 0 0 10px #ccc; }
        input { width: 100%; padding: 10px; margin: 10px 0; border-radius: 5px; }
        input[type=submit] { background-color: #007BFF; color: white; border: none; }
        .msg { color: green; text-align: center; }
        .error { color: red; text-align: center; }
    </style>
</head>
<body>
    <form action="update" method="post">
        <h2>Update Employee</h2>
        <input type="number" name="id" placeholder="Employee ID" required />
        <input type="text" name="name" placeholder="New Name" required />
        <input type="email" name="email" placeholder="New Email" required />
        <input type="number" name="salary" placeholder="New Salary" required />
        <input type="submit" value="Update" />
        <div class="msg">${msg}</div>
        <div class="error">${error}</div>
    </form>
</body>
</html>