class Father{
	
	// non static -> property of object
	void purchaseBike(){
		System.out.println("Lets Purchase Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets Purchase Maruti");
	}
	
	static void show(){
		
	}
}

class Son extends Father{
	
	// Redefine the same method of parent.
	// Overriding
	void purchaseBike(){
		super.purchaseBike();
		System.out.println("Lets Purchase Royal Enfield");
	}
	
	// Hiding
	static void purchaseCar(){
		Father.purchaseCar();
		System.out.println("Lets Purchase Honda");
	}	
	
	
	// error
	//void show(){
		
	//}
	
}

public class Overriding {

	public static void main(String[] args) {
		
		Son son = new Son();
		son.purchaseBike();
		
		Son.purchaseCar();
	

	}

}
