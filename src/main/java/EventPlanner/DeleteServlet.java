package EventPlanner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String peventname = request.getParameter("peventname");
		
		boolean result;
		
		result = EventPlannerDBUtil.deleteEvent(peventname);
		try {
            
            if (result) {
            	 List<PendingEvents> recieved = EventPlannerDBUtil.getAllData();
                 request.setAttribute("recieved", recieved);
                
                 if(recieved.isEmpty()) {
            	RequestDispatcher errorDispatcher = request.getRequestDispatcher("unsuccess.jsp");
                errorDispatcher.forward(request, response);
                }else {
                	request.setAttribute("details", recieved);
                	RequestDispatcher errorDispatcher = request.getRequestDispatcher("pendingEvents.jsp");
                	errorDispatcher.forward(request, response);
                }
            } 
            
            else {

                RequestDispatcher successDispatcher = request.getRequestDispatcher("unsuccess.jsp");
                successDispatcher.forward(request, response);
            }
        } 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
