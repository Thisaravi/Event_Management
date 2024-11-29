package EventPlanner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PendingEventsServlet")
public class PendingEventsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<PendingEvents> details = EventPlannerDBUtil.getAllData();
        request.setAttribute("details", details);

        RequestDispatcher dis = request.getRequestDispatcher("pendingEvents.jsp");
        dis.forward(request, response);
	}

}
