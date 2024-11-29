package EventPlanner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String eventName = request.getParameter("name");
		String eventDate = request.getParameter("date");
		String StartTime = request.getParameter("sTime");
		String endTime = request.getParameter("eTime");
		String eventLocation = request.getParameter("location");
		String eventDescription = request.getParameter("des");
		String eventOrganizer = request.getParameter("ep");
		String eventAttendees = request.getParameter("att");
		String eventRegDate = request.getParameter("Rdate");

        boolean result;

        result = EventPlannerDBUtil.updateEventDetails(eventName, eventDate, StartTime, endTime, eventLocation, eventDescription, eventOrganizer, eventAttendees,eventRegDate);

        try {
            if (result) {

            	List<insertEvent> getAllData = EventPlannerDBUtil.getEventDetails();
                request.setAttribute("getAllData", getAllData);

                if (getAllData.isEmpty()) {
                    RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
                    dis2.forward(request, response);
                } 
                
                else {
                    request.setAttribute("details", getAllData);
                    RequestDispatcher dis2 = request.getRequestDispatcher("PlannedServlet");
                    dis2.forward(request, response);
                }
            } 
            
            else {
                RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
                dis.forward(request, response);
            }
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
	}

}