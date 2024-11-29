<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
       <meta charset="ISO-8859-1">
       <title>Registered Events</title>
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
       <body style="background:linear-gradient(rgba(0, 0, 0, 0.443), rgba(0, 0, 0, 0.395)), url('images/edit.jpg') no-repeat center center fixed; background-size: cover; height: 100vh;">
       
</head>
<body>
	<div class="container pb-5">
            <div class="row">
                <div class="d-flex justify-content-around">
                    <h1 id="topic" style="color:white;">Registered Events</h1>
                </div>
            </div>
        </div>
		
		<div class="container">
            <table class="table table-bordered table-striped transparent-table pt-4" style="margin: auto; width: 90%;">

                <c:forEach var="PlannedE" items="${planned}">
                    <c:set var="eventName" value="${PlannedE.eventName}" />
                    <c:set var="eventDate" value="${PlannedE.eventDate}" />
                    <c:set var="StartTime" value="${PlannedE.startTime}" />
                    <c:set var="endTime" value="${PlannedE.endTime}" />
                    <c:set var="eventLocation" value="${PlannedE.eventLocation}" />
                    <c:set var="eventDescription" value="${PlannedE.eventDescription}" />
                    <c:set var="eventOrganizer" value="${PlannedE.eventOrganizer}" />
                    <c:set var="eventAttendees" value="${PlannedE.eventAttendees}" />
                    <c:set var="eventRegDate" value="${PlannedE.eventRegDate}" />
                    
                    <tr>
                        <td>${PlannedE.eventName }</td>
                        <td>${PlannedE.eventDate }</td>
                        <td>${PlannedE.startTime }</td>
                        <td>${PlannedE.endTime }</td>
                        <td>${PlannedE.eventLocation }</td>
                        <td>${PlannedE.eventDescription }</td>
                        <td>${PlannedE.eventOrganizer }</td>
                        <td>${PlannedE.eventAttendees }</td>
                        <td>${PlannedE.eventRegDate }</td>
       
                        <td>
                            <form action="planned" method="GET">
                            <input type="hidden" name="eventName" value="${PlannedE.eventName }" class="btn btn-success">
                            <input type="submit" value="Edit">
                            </form>
                            </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
		
</body>
</html>