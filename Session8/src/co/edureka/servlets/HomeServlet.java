package co.edureka.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet(
		description = "This is Home to the User", 
		urlPatterns = { 
				"/HomeServlet", 
				"/Welcome"
		})
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Read the data from Request
		//String email = request.getParameter("txtEmail");
		//String password = request.getParameter("txtPassword");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Response2
		//out.println("Welcome Admin, "+email);
		//out.println("Its, "+new Date());
		
		out.println("Welcome Home <br/>");
		
		// 1. Cookies
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.println(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		// 2. URL-ReWriting
		//String name = request.getParameter("name");
		//String age = request.getParameter("age");
		
		// 3. Hidden Form Field
		//String name = request.getParameter("txtName");
		//String age = request.getParameter("txtAge");
		
		//4. HttpSession
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		int age = (Integer)session.getAttribute("keyAge");
		
		out.println("Name is: "+name+" and age is: "+age);
	}

}
