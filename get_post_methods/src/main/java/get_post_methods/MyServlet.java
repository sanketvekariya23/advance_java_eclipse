package get_post_methods;

import java.io.IOException;
import java.io.PrintWriter;

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
		String email1 = req.getParameter("email");
		String password1 = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		if (email1.equals("sanket@gmail.com") && password1.equals("sanket123") ) {
			System.out.println("you have login successfully");
			out.print("you have login successfully");
		}
		else {
			System.out.println("either email or password is incorrect..");
			out.print("either email or password is incorrect..");
		}
	}
}
