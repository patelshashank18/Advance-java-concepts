<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">

    <title>Employee Registration</title>

</head>

<body>

    <h2>Employee Registration Form</h2>

    <!-- Employee registration form -->
    <form action="register" method="post">

        <label>First Name:</label>
        <input type="text" name="firstName" required>
        <br><br>

        <label>Last Name:</label>
        <input type="text" name="lastName" required>
        <br><br>

        <label>Email:</label>
        <input type="email" name="email" required>
        <br><br>

        <label>Phone:</label>
        <input type="text" name="phone" required>
        <br><br>

        <label>Salary:</label>
        <input type="number" name="salary" step="0.01" required>
        <br><br>

        <input type="submit" value="Register">

    </form>

</body>
</html>