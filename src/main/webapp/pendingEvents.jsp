<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Pending Events</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    	<body style="background:linear-gradient(rgba(0, 0, 0, 0.443), rgba(0, 0, 0, 0.395)), url('images/reg.jpeg') no-repeat center center fixed; background-size: cover; height: 100vh;">
	</head>
	<body>
        <div class="container pb-5">
            <div class="row">
                <div class="d-flex justify-content-around">
                    <h1 id="topic" style="color:white;">Pending Events</h1>
                </div>
            </div>
        </div>

        <div class="container">
            <table class="table table-bordered table-striped transparent-table pt-4" style="margin: auto; width: 90%;">

                <c:forEach var="Events" items="${details}">
                    <c:set var="peventname" value="${Events.peventname }" />
                    <c:set var="pdate" value="${Events.pdate }" />
                    <c:set var="venue" value="${Events.venue }" />
                    <c:set var="attendees" value="${Events.attendees }" />

                    <tr>
                        <td>${Events.peventname }</td>
                        <td>${Events.pdate }</td>
                        <td>${Events.venue }</td>
                        <td>${Events.attendees }</td>
       
                        <td>
                            <c:url value="Insert.jsp" var="insertEvent">
                                <c:param name="peventname" value="${peventname}" />
                                <c:param name="pdate" value="${pdate}" />
                                <c:param name="venue" value="${venue}" />
                                <c:param name="attendees" value="${attendees}" />
                               
                            </c:url>
                            <a href="${insertEvent}">
                                <button class="btn btn-info" style="margin-left: 100px;">Approve</button>
                            </a>
                            
                            <form action="DeleteServlet" method="post">
                            <input type="hidden" value="${peventname}" name="peventname">
                            <button class="btn btn-danger">Deny</button>
                            </form>
                            
                            
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    </body>
</html>
