package co.edureka.db;

import java.util.ArrayList;

public class JavaClient {

	public static void main(String[] args) {
		
		// Object Construction
		// Temporary in the HEAP area of RAM. Its volatile
		// Save the state of an Object
		Employee e1 = new Employee(0,"Sia",18,"Eastern Shores",22700);
		e1.showEmployee();
		
		Employee e2 = new Employee();
		e2.id = 6;
		e2.name = "Adam";
		e2.salary = 63300;
		
		//e2.showEmployee();
		
		//1. Load the Driver
		JDBCHelper helper = new JDBCHelper();
		
		//2. Open The Conenction
		helper.openConnection();
		
		//3. Write a SQL Statement
		//4. Execute a SQL Statement

		//helper.insertEmployee(e1);
		//helper.insertEmployee(e2);
		
		//helper.updateEmployee(e2);
		
		//helper.deleteEmployee(5);
		
		/*ArrayList<Employee> emps = helper.showEmployees();
		System.out.println("================================");
		for(Employee emp : emps){
			emp.showEmployee();
			System.out.println("================================");
		}*/
		
		//helper.executeProcedure(e1);
		
		helper.processBatch();
		
		//5. Close the Connection
		helper.closeConnection();

	}

}
