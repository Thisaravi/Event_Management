<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Page</title>
    <body style="background:linear-gradient(rgba(0, 0, 0, 0.443), rgba(0, 0, 0, 0.395)), url('images/login.jpg') no-repeat center center fixed; background-size: cover; height: 100vh;">
</head>
<body>
	<h1 style="text-align: center; color: #fff;">Welcome to Glamour Events </h1>
    <div style="width: 300px; margin: 0 auto; padding: 20px; border: 1px solid #ddd; border-radius: 5px; text-align: center; backdrop-filter: blur(5px);">
        <h2>Login</h2>
        <form action="log" method="post">
            <div style="margin: 10px 0;">
                <label for="uid" style="display: block; font-weight: bold;">User Name</label>
                <input type="text" name="uid" id="uid" style="width: 90%; padding: 10px; margin: 5px 0;">
            </div>
            <div style="margin: 10px 0;">
                <label for="pass" style="display: block; font-weight: bold;">Password</label>
                <input type="password" name="pass" id="pass" style="width: 90%; padding: 10px; margin: 5px 0;">
            </div>
            <button type="submit" style="width: 100%; padding: 10px; background-color: #007bff; color: #fff; border: none; border-radius: 5px; cursor: pointer;">Login</button>
        </form>
    </div>
</body>
</html>
    