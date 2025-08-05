<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        h2 {
            background-color: #35495e;
            color: #ffffff;
            padding: 20px 0;
            margin-bottom: 30px;
        }

        form {
            background-color: #ffffff;
            display: inline-block;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
        }

        input[type="text"],
        input[type="email"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #1976d2;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #1565c0;
        }

        .msg {
            margin: 15px 0;
            color: green;
            font-weight: bold;
        }

        .error {
            margin: 15px 0;
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h2>Add New Employee</h2>

    <div class="msg">${message}</div>
    <div class="error">${error}</div>

    <form action="add" method="post">
        Name: <input type="text" name="name" required><br>
        Email: <input type="email" name="email" required><br>
        Salary: <input type="number" name="salary" required><br>
        <input type="submit" value="Add">
    </form>
</body>
</html>
