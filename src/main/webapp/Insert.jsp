<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Event Registration Form</title>
    	<body style="background:linear-gradient(rgba(0, 0, 0, 0.443), rgba(0, 0, 0, 0.395)), url('images/insert.jpg') no-repeat center center fixed; background-size: cover; height: 100vh;">

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin-left: 400px;
            padding: 0;
            display: flex;
            height: 100vh;
        }
        form {
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 600px;
            height:1000px;
            backdrop-filter: blur(5px);
        }
        label, input {
            display: block;
            margin: 10px 0;
        }
        input[type="text"], input[type="date"], input[type="time"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            outline: none;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <form action="insert" method="post">
        <h2>Event Registration Form</h2>
        
        <label for="name">Event Name:</label>
        <input type="text" name="name" id="name">
        <label for="date">Event Date:</label>
        <input type="date" name="date" id="date">
        <label for="sTime">Starting Time:</label>
        <input type="time" name="sTime" id="sTime">
        <label for="eTime">Ending Time:</label>
        <input type="time" name="eTime" id="eTime">
        <label for="location">Venue:</label>
        <input type="text" name="location" id="location">
        <label for="des">Description:</label>
        <input type="text" name="des" id="des">
        <label for="ep">Event Organizer:</label>
        <input type="text" name="ep" id="ep">
        <label for="att">Event Attendees:</label>
        <input type="text" name="att" id="att">
        <label for="Rdate">Registered Date:</label>
        <input type="date" name="Rdate" id="Rdate">
        <input type="submit" name="submit" value="Save Event">
    </form>


</body>
</html> 