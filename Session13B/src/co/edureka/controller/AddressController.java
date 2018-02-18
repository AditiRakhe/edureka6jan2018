package co.edureka.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.model.AddressModel;

/**
 * Servlet implementation class AddressController
 */
@WebServlet({ "/AddressController", "/Address" })
public class AddressController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String adrsLine = request.getParameter("txtAdrs");
		String city = request.getParameter("txtCity");
		String state = request.getParameter("txtState");
		String zipCode = request.getParameter("txtZipCode");
		
		if(!adrsLine.isEmpty() && !zipCode.isEmpty()){
			
			AddressModel model = new AddressModel();
			model.setAdrsLine(adrsLine);
			model.setCity(city);
			model.setState(state);
			model.setZipCode(Integer.parseInt(zipCode));
			
			System.out.println(model);
			
			// Core Business Logic:
			// Dump the Model in DB | Use Hibernate, Spring, JDBC
			
		}
		
		
	}

}
