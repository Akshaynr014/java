<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee</title>
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

        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #d32f2f;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #b71c1c;
        }
    </style>
</head>
<body>
    <h2>Delete Employee by ID</h2>
    <form action="delete" method="post">
        Enter Employee ID: <input type="number" name="id" required>
        <input type="submit" value="Delete">
    </form>
</body>
</html>