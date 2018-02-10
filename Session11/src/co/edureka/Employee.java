package co.edureka;

// Bean | Model or POJO(Plain Old Java Object)

public class Employee {
	// Attributes
	int id;
	String name;
	int salary;
	String email;
	String address;
	
	public Employee(){
		System.out.println("Employee Object Constructed");
	}
	
	public Employee(int id, String name, int salary, String email, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void myInit(){ // AnyName of Your choice
		System.out.println("Employee Object's myInit Executed...");
	}
	
	public void myDestroy(){
		System.out.println("Employee Object's myDestroy Executed...");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]\n"+super.toString();
	}
	
}
