
public class Overloading {
	
	// Polymorphism : Compile Time - Compiler linkes the fuction call with the defintion by matching signature
		// signature -> fun(), fun(int a)
		
		// 1. Method Name Should be Same
		// 2. Signature should be different
			// 2.1 Number of Inputs
			// 2.2 Type of Inputs
			// 2.3 Sequence of Inputs
		
		// 3. Return Type has no impact

	// 2.1 Number of Inputs
	void fun(){
		System.out.println("This is fun");
	}
	
	/*int fun(){
		System.out.println("This is fun");
		return 0;
	}*/ // error - return type has no impact
	
	int fun(int a){
		System.out.println("This is fun again and a is: "+a);
		return a;
	}
	
	void fun(int a, int b){
		System.out.println("This is fun gives "+(a*b));
	}
	
	// 2.2 Type of Inputs
	void fun(float a){
		System.out.println("This is fun again and a is: "+a);
	}
	
	void fun(float a, float b){
		System.out.println("This is fun gives "+(a*b));
	}
	
	// 2.3 Sequence of Inputs
	void fun(int a, float b){
		System.out.println("This is fun gives "+(a*b));
	}
	
	void fun(float a, int b){
		System.out.println("This is fun gives "+(a*b));
	}
	
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		
		oRef.fun();
		oRef.fun(10);
		oRef.fun(10,20);
		oRef.fun(10.2f,20.4f);
		oRef.fun(10.1f);
		oRef.fun(12,12.22f);
		oRef.fun(12.22f,13);

	}

}
