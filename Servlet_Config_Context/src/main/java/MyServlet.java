import java.util.Enumeration;
import java.util.jar.Attributes;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {  // created config object
		
		ServletContext context = config.getServletContext();  // created context object for setting data
		
		Enumeration<String> e =config.getInitParameterNames();
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			String value = config.getInitParameter(name);
			System.out.println("name : " +name + " value : " + value);
			
//			for Servlet context We have to set Attributes and that is accessble via ServletContext object in another servlet
			context.setAttribute(name, value);
		}
	}
}
