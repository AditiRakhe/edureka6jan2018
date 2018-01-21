import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization - Writing the data in an object into a file

class Employee implements Serializable{ // Serializable is a Marker Interface
	
	int eid;
	String ename;
	transient String email; // Non Serializable
	
	Employee(){
		
	}
	
	Employee(int eid, String ename, String email){
		this.eid = eid;
		this.ename = ename;
		this.email = email;
	}
	
	void showEmployeeDetails(){
		System.out.println(eid+" belongs to "+ename+" and can be emailed at "+email);
	}
}

public class SerializationDemo {

	public static void main(String[] args) {

		// Object is a container created in the RAM. It is temporary.
		Employee e1 = new Employee(101,"John","john@example.com");
		//e1.showEmployeeDetails();
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/emps.dat"); // database file
			
			// Serialization
			/*FileOutputStream fos = new FileOutputStream(file);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos); // Object can be written directly into the file
			oos.writeObject(e1);
			
			System.out.println("Object Written in File");*/
			
			// De-Serialization
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee)ois.readObject();
			emp.showEmployeeDetails();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}

}
