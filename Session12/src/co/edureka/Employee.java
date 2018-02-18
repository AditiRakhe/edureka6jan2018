package co.edureka;

// Bean
public class Employee {
	
	int id;
	String name;
	String email;
	String password;
	int age;
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, String email, String password, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", age=" + age
				+ "]";
	}
	
	// Business Methods
	public void loginEmployee(int type){
		
		String role = "";
		
		if(type == 1)
			role = "Admin";
		else
			role = "User";
		
		// Ideally we should check this from DB.
		if(email.equals("john@example.com") && password.equals("password123")){
			System.out.println("Welcome Home John");
			System.out.println("You have been assigned as a role of "+role);
		}else{
			System.out.println("Please Enter Correct Details");
		}
	}
}
