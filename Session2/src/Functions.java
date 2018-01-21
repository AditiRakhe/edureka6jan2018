
public class Functions {

	// Non Static Methods
	void addNumbers(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum is: "+c);
	}
	
	void addNumbersAgain(int a, int b){
		int c = a+b;
		System.out.println("sum is: "+c);
	}
	
	int calaculateArea(int l, int b){
		int area = l*b;
		return area;
	}
	
	// Static Methods
	static void addNumbers1(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum is: "+c);
	}
	
	static void addNumbersAgain1(int a, int b){
		int c = a+b;
		System.out.println("sum is: "+c);
	}
	
	static int calaculateArea1(int l, int b){
		int area = l*b;
		return area;
	}
	
	
	// main is a method
	public static void main(String[] args) {
		
		// To execute non static methods
		Functions fRef = new Functions(); // Object of type Functions
		
		fRef.addNumbers(); // call to a method
		fRef.addNumbersAgain(120, 240);
		//int a = fRef.calaculateArea(10, 20);
		//System.out.println("Area is: "+a);
		System.out.println("Area is: "+fRef.calaculateArea(10, 20));
		
		// To Execute static methods
		Functions.addNumbers1();
		Functions.addNumbersAgain1(30,70);
		int a = Functions.calaculateArea1(23, 33);
		System.out.println("Area is: "+a);
	}

}
