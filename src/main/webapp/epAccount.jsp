<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Dashboard</title>
    <body style="background:linear-gradient(rgba(0, 0, 0, 0.443), rgba(0, 0, 0, 0.395)), url('images/account.jpg') no-repeat center center fixed; background-size: cover; height: 100vh;">
    
    <style>
    	.dashboard-container {
            display: flex;
        }
    	.sidebar {
            width: 200px;
            color: #fff;
            padding: 40px;
            backdrop-filter: blur(2px);
        }

        .sidebar ul {
            list-style: none;
            padding: 50px;
        }

        .sidebar li {
            margin-bottom: 10px;
        }

        .sidebar a {
            text-decoration: none;
            color: #fff;
            font-weight: bold;
        }
        
        .content {
            flex: 1;
            padding: 100px;
        }
    	
        table {
            width: 50%;
            margin: 200px auto;
            margin-left:10%;
            position: absolute;
      		top: 50%;
      		left: 50%;
      		transform: translate(-50%, -50%);
   			align:right;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 20px;
            font-weight: bold;
        }
        .plan-events-button {
            display: inline-block;
            text-decoration: none;
            background-color: #007bff;
            color: #fff;
            padding: 20px 50px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
	
	<h1 style="color: #fff;">GLAMOUR EVENTS</h1>
    <div class="dashboard-container">
        <div class="sidebar" >
            <ul>
                <li><button type="submit" style="width:100%; height:50%;">Profile</button></li>
                <li><form action="PendingS" method="post"><button type="submit" style="width:100%; height:50%;">Pending Events</button></form></li>
                <li><form action="planned" method="post"><button type="submit" style="width:100%; height:50%;">Registered Events</button></form></li>
           
                <li><button type="submit" style="width:100%; height:50%;">Settings</button></li>
            </ul>
        </div>
        <img src="images/planner.jpg"  style="width:400px; height:300px; margin-left:480px;">
    <table >
        <c:forEach var="eventP" items="${EPdetails}">
            <tr>
                <td>EventPlanner ID:</td>
                <td>${eventP.id}</td>
            </tr>
            <tr>
                <td>EventPlanner Name:</td>
                <td>${eventP.name}</td>
            </tr>
            <tr>
                <td>EventPlanner Email:</td>
                <td>${eventP.email}</td>
            </tr>
            <tr>
                <td>EventPlanner Phone:</td>
                <td>${eventP.phone}</td>
            </tr>
            <tr>
                <td>EventPlanner UN:</td>
                <td>${eventP.userName}</td>
            </tr>
        </c:forEach>
    </table>
    </div>
</body>
</html>
