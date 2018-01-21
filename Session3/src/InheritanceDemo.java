class NewUser{

	// Attributes
	String name;
	int age;
	
	NewUser(){
		name = "NA";
		age = 10;
		System.out.println("NewUser is Created..");
	}
	
	void showUser(){
		System.out.println(name+" is "+age+" years old !! ");
	}
}

// Constructors are not inherited..
// If you inherit Object of Parent is created first and then the object of child is created...

class FBUser extends NewUser{
	
	FBUser(){
		System.out.println("FaceBook User Created..");
	}
	
}



public class InheritanceDemo {

	public static void main(String[] args) {

		//NewUser u1 = new NewUser();
		//u1.showUser();
		
		FBUser u1 = new FBUser();
		u1.showUser();		

	}

}
