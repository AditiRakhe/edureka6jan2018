package co.edureka.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter implements Filter {

    
	public void destroy() {
		System.out.println("Filter Destroy");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// Pre-Processing -  Place your code here
		System.out.println("Filter Pre-Processing");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(email.isEmpty() && password.isEmpty()){
			out.println("Please Enter Email and Password First");
		}else{
			// pass the request along the filter chain
			chain.doFilter(request, response); // Take the request to the Servlet
			
			
			//  Post-Processing -  Place your code here
			System.out.println("Filter Post-Processing");
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}

}
