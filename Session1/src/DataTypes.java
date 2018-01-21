
public class DataTypes {

	public static void main(String[] args) {
		
		System.out.println("Hello World...");
		
		// Primitive Types are SVC to store the data for your app
		// Data is stored Temporarily in the RAM in the STACK
		
		// data_type identifier = literal;
		//        variable or container
		
		int num = 10;
		//int age = 20,30; can contain only one value
		
		num = 100;
		
		char gender = 'M';
		gender = 'F';
		
		System.out.println("Number is: "+num);
		System.out.println("Gender is: "+gender);
		
		char ch = 67; // ASCII
		System.out.println(ch);
		
		char rupee = '\u20b9'; //Unicode 
		System.out.println(rupee);
		
		boolean flag = true;
		flag = false;
		
		float pi = 3.14f;
		
		int a = 10;
		int b = 3;
		int c = a+b;
		int d = a%b;

		System.out.println(c);
		System.out.println(d);
		
		a++;
		++a;
		
		System.out.println(a);
		
		//a = a + 10;
		a += 10;
		System.out.println(a);
	}

}
