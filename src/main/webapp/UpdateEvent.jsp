<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Event Details</title>
    	<body style="background:linear-gradient(rgba(0, 0, 0, 0.443), rgba(0, 0, 0, 0.395)), url('images/insert.jpg') no-repeat center center fixed; background-size: cover; height: 200vh;">

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
            backdrop-filter: blur(5px);
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 600px;
            height:1000px;
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

<c:set var="PlannedE" value="${planned}" />
	<form action="updateServlet" method="post">
		<h2>Update Event Details</h2>
        
        <label for="name">Event Name:</label>
        <input type="text" name="name" value="${PlannedE.eventName }">
        <label for="date">Event Date:</label>
        <input type="date" name="date" value="${PlannedE.eventDate }">
        <label for="sTime">Starting Time:</label>
        <input type="time" name="sTime" value="${PlannedE.startTime }">
        <label for="eTime">Ending Time:</label>
        <input type="time" name="eTime" value="${PlannedE.endTime }">
        <label for="location">Venue:</label>
        <input type="text" name="location" value="${PlannedE.eventLocation }">
        <label for="des">Description:</label>
        <input type="text" name="des" value="${PlannedE.eventDescription }">
        <label for="ep">Event Organizer:</label>
        <input type="text" name="ep" value="${PlannedE.eventOrganizer }">
        <label for="att">Event Attendees:</label>
        <input type="text" name="att" value="${PlannedE.eventAttendees }">
        <label for="Rdate">Registered Date:</label>
        <input type="date" name="Rdate" value="${PlannedE.eventRegDate }">
        <input type="submit" name="submit" value="Update Event">

	
	</form>

</body>
</html>