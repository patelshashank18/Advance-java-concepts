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

    <form action="register" method="post">

        <label>Firstname:</label>
        <input type="text" name="firstname" required>

        <br><br>

        <label>Lastname:</label>
        <input type="text" name="lastname" required>

        <br><br>

        <label>Username:</label>
        <input type="text" name="username" required>

        <br><br>

        <label>Password:</label>
        <input type="password" name="password" required>

        <br><br>

        <label>Address:</label>
        <textarea name="address"></textarea>

        <br><br>

        <label>Contact No:</label>
        <input type="text" name="contactNo">

        <br><br>

        <input type="submit" value="Register">

    </form>

</body>

</html>