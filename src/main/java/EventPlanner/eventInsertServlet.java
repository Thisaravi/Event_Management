package EventPlanner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/eventInsertServlet")
public class eventInsertServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String name= request.getParameter("name");
		String Date=request.getParameter("date");
		String StartTime=request.getParameter("sTime");
		String EndTime=request.getParameter("eTime");
		String Venue=request.getParameter("location");
		String Description=request.getParameter("des");
		String eOrganizer=request.getParameter("ep");
		String Attendees=request.getParameter("att");
		String RegD=request.getParameter("Rdate");
		
		
		boolean isTrue;
		System.err.println(Venue);
		isTrue = EventPlannerDBUtil.insertEdetails(name, Date, StartTime, EndTime, Venue, Description, eOrganizer, Attendees , RegD);
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("PlannedServlet");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}
}

