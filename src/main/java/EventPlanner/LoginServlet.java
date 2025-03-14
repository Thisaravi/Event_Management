package EventPlanner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("uid");
        String password = request.getParameter("pass");
        
        try {
            List<EventPlanner> EPdetails = EventPlannerDBUtil.validate(username, password);
            
            if (EPdetails != null && !EPdetails.isEmpty()) {
                
                request.setAttribute("EPdetails", EPdetails);
                RequestDispatcher dis = request.getRequestDispatcher("epAccount.jsp");
                dis.forward(request, response);
            } else {
                
                RequestDispatcher dis = request.getRequestDispatcher("login.jsp"); 
                dis.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
