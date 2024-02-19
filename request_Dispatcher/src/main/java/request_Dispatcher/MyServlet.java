package request_Dispatcher;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class MyServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if (email.equals("sanket@gmail.com") && password.equals("sanket123")) {
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.forward(req, resp);
		}
	}
}
