package co.edureka.db;
public class Employee {

	// Attributes
	int id;
	String name;
	int age;
	String address;
	int salary;
	
	Employee(){
		
	}
		
	public Employee(int id, String name, int age, String address, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	void showEmployee(){
		System.out.println(id+" - "+name+" - "+age+" - "+address+" - "+salary);
	}
	
}
