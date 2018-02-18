package co.edureka;

import java.util.Date;

// Java Class is a WebService
public class MyWebService {
	
	// It shall have WebMethods
	public String sayHello(String name){
		String dateTime = new Date().toString();
		String response = "Hello, "+name+" Its "+dateTime;
		return response;
	}
	
	public int mtrToCm(int mtrs){
		int cms = mtrs*100;
		return cms;
	}
	
	public int feetToInches(int feet){
		int inches = feet*12;
		return inches;
	}
	
	public String registerEmployee(int eid, String name, int salary){
		// JDBC Code
		String response = name+" with eid registered succesffully with salary of "+salary;
		return response;
	}
	
}
