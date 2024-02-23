import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/Filter")
public class MyServlet implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain Chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		int id  = Integer.parseInt(req.getParameter("id"));
		PrintWriter out = response.getWriter();
		
		if (id > 1) {
			Chain.doFilter(req, response);
		}
		else {
			out.print("invalid inputs");
		}
	}
	
}	