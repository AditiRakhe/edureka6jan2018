class Parent{
	
	int a;
	static int b;
	
	Parent(){
		System.out.println("Parent Object Created..");
	}
	
	void show(){
		System.out.println("a is: "+a);
	}
	
	static void showAgain(){
		System.out.println("b is: "+b);
	}
}


class Child extends Parent{
	
	Child(){
		System.out.println("Child Object Created..");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {

		Child ch = new Child();
		
		// Object to Object
		ch.a = 10;
		ch.show();
		
		// Class to Class
		Child.b = 100;
		Child.showAgain();

	}

}
