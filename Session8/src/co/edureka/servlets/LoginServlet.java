package co.edureka.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		description = "This Servlet shall handle Login Requests", 
		urlPatterns = { 
				"/LoginServlet", 
				"/Login"
		})
public class LoginServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlet - init executed");
	}


	public void destroy() {
		System.out.println("LoginServlet - destroy executed");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				System.out.println("LoginServlet - service executed");
				// Share response back to the client
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				// Read the data from Request
				String email = request.getParameter("txtEmail");
				String password = request.getParameter("txtPassword");
				
				String adminName = "";
				int adminAge = 0;
				
				if(email.equals("admin@example.com") && password.equals("password123")){
					
					adminName = "John Watson";
					adminAge = 30;
					
					// Response1
					//out.println("<h3>Welcome Admin, "+adminName+" | Age: "+adminAge+"</h3><br/>");
					//out.println("<h2>Its: "+new Date()+"</h2>");
					
					// Forwarding the control to the Welcome i.e. HomeServlet
					//RequestDispatcher rd = request.getRequestDispatcher("Welcome");
					//RequestDispatcher rd = request.getRequestDispatcher("Awesome");
					//rd.forward(request, response);
					
					// 1. Cookies
					/*Cookie ck1 = new Cookie("keyName", adminName);
					Cookie ck2 = new Cookie("keyAge", String.valueOf(adminAge));
					
					response.addCookie(ck1);
					response.addCookie(ck2);
					
					out.println("<a href='Welcome'>Enter Home</a>");*/
					
					// 2. URL ReWriting
					//out.println("<a href='Welcome?name="+adminName+"&age="+adminAge+"'>Enter Home</a>");
					
					// 3. Hidden Form Field
					/*out.println("<html><body>");
					out.println("<form action='Welcome' method='post'>");
					out.println("<input type='hidden' name='txtName' value='"+adminName+"'/>");
					out.println("<input type='hidden' name='txtAge' value='"+adminAge+"'/>");
					out.println("<input type='submit' value='Enter Home'/>");
					out.println("</body></html>");*/
					
					//4. HttpSession Object
					HttpSession session = request.getSession();
					session.setAttribute("keyName", adminName);
					session.setAttribute("keyAge", adminAge);
					out.println("<a href='Welcome'>Enter Home</a>");
					
				}else{

					out.println("<b>Invalid Credentials</b>");
					
					//RequestDispatcher rd = request.getRequestDispatcher("newuser.html");
					//rd.include(request, response);
					
					response.sendRedirect("https://www.google.co.in");
					
				}
						
		
	}

}
