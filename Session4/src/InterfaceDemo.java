interface Inf1{
	
	int a = 10;  // public static final int a = 10;
	
	void fun(); // public abstract void fun();
}

interface Inf2{
	void show(); // public abstract void show();
	void fun();  // public abstract void fun();
}

interface Inf3{
	void hello(String name);
}

// Multiple Inheritance | Interface to Interface, Its not Object to Object
interface Inf extends Inf1, Inf2, Inf3{
	
}

// Java does not supports multiple inheritance
// but multiple implementation can be achieved using interfaces.

class CA implements Inf{//Inf1,Inf2,Inf3{ // Multiple Implementation
	
	public void fun(){
		System.out.println("This is fun");
	}
	
	public void show(){
		System.out.println("This is show");
	}
	
	public void hello(String name){
		System.out.println("Hello, "+name);
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		//Inf1 i1 = new CA();
		//i1.fun();
		//i1.show(); err
		//i1.hello("John"); err
		
		//Inf2 i2 = new CA();
		//i2.show();
		//i2.fun();
		//i2.hello("Jennie"); err
		
		//Inf3 i3 = new CA();
		//i3.hello("Jack");
		//i3.fun(); err
		//i3.show(); err
		
		Inf i = new CA();
		i.fun();
		i.show();
		i.hello("John");
		
		System.out.println(Inf1.a);

	}

}
