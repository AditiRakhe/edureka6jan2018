package co.edureka.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(
		description = "This Servlet shall register a new user", 
		urlPatterns = { 
				"/RegisterServlet", 
				"/Register"
		})
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet - doPost executed");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Read the data from Request
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		// Write JDBC Code Here
		
		out.println("<b>"+name+" Thank you for registering with us..!!</b>");
			

		
	}

}
