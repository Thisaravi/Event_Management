package EventPlanner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlannedServlet")
public class PlannedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<insertEvent> planned = EventPlannerDBUtil.getEventDetails();
        request.setAttribute("planned", planned);

        RequestDispatcher dis = request.getRequestDispatcher("PlannedEvents.jsp");
        dis.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		insertEvent planned = EventPlannerDBUtil.getSingleEventDetails(request.getParameter("eventName"));
        request.setAttribute("planned", planned);

        RequestDispatcher dis = request.getRequestDispatcher("UpdateEvent.jsp");
        dis.forward(request, response);
	}

}
