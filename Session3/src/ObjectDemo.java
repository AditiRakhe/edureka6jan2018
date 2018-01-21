// Textually Describing an Object with the help of class

class User{ 
	
	// Attributes | Property of Object and not the property of class
	String name;
	private String phone;
	String email;
	int age;
	char gender;
	private String address;
	
	// Methods | Property of Object and not the property of class
	void setPhone(String p){ // Setter, which writes the data in attribute of an Object
		phone = p;
	}
	
	String getPhone(){  // Getter, which read the data of attribute in an Object
		return phone;
	}
	
	
	void setAddress(String a){
		address = a;
	}
	
	String getAddress(){
		return address;
	}
	
	// Mics Methods
	void showUserDetails(){
		System.out.println(name+" lives in "+address+" and can be reached at "+phone);
	}
	
	// Business Methods | Logical 
	void checkPhone(){
		if(phone.length() != 10){
			System.out.println("Dear, "+name+"  "+phone+" This is an Invalid Number !! ");
		}else{
			System.out.println(name+" can be contacted at "+phone);
		}
	}
}


public class ObjectDemo {

	public static void main(String[] args) {

		int i = 10; // SVC
		
		int[] arr = {10,20,30,40,50}; // MVC
		
		// Object construction Statement
		User u1 = new User(); // MVC
		User u2 = new User(); // MVC
		
		User u3 = u1; // Reference Copy
		
		// new creates the Object dynamically i.e. at run time in the heap and acknowledges with the address.
		
		// i is value type, its a variable
		// arr and u1 are reference type. they are reference variables.
		// arr is RV of type integer array
		// u1 is RV of type User
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		
		// Write Data in Object
		u3.name = "John"; // it means the same as u1.name = "John";
		//u1.phone = "9876543233";
		u1.setPhone("9876543233");
		u1.email = "john@example.com";
		u1.age = 28;
		u1.gender = 'M';
		//u3.address = "Redwood Shores"; // it means the same as u1.address = "Redwood Shores";
		u3.setAddress("Redwood Shores");
		
		u2.name = "Jennie";
		//u2.phone = "8765432345";
		u2.setPhone("87654345");
		u2.email = "jennie@example.com";
		u2.age = 26;
		u2.gender = 'F';
		//u2.address = "Northern Shores";
		u2.setAddress("Northern Shores");
		
		// Read the data from Object
		//System.out.println(u1.name+" can be emailed at "+u3.email+" and lives in "+u1.address);
		//System.out.println(u2.name+" can be emailed at "+u2.email+" and lives in "+u2.address);
		//System.out.println(u1.name+" can be emailed at "+u3.email+" and lives in "+u1.getAddress());
		//System.out.println(u2.name+" can be emailed at "+u2.email+" and lives in "+u2.getAddress());
		
		u1.showUserDetails();
		u2.showUserDetails();
		
		u1.checkPhone();
		u2.checkPhone();

	}

}
