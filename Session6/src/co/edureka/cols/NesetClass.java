package co.edureka.cols;

// Object within an Object | Box in a Box
class Outer{
	
	void show(){
		System.out.println("Show of Outer");
	}
	
	// class in a class | Nested class or Inner class
	class Inner{
		void show(){
			System.out.println("Show of Inner");
		}
	}
}

public class NesetClass {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		
		Outer.Inner inner = out.new Inner();
		
		out.show();
		inner.show();

	}

}
