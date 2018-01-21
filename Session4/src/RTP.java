/*class Shape{
	
	// When the object is created in the heap, constructor is called to initialize data in object
	Shape(){
		System.out.println("Shape Object Constructed");
	}
	
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

/*abstract class Shape{
	
	// When the object is created in the heap, constructor is called to initialize data in object
	Shape(){
		System.out.println("Shape Object Constructed");
	}
	
	// Its is created only in an abstract class.
	// Its a rule i.e. a protocol which a child must define
	abstract void draw();
	// thr can be n number of abstract methods, child must redefine all the abstract methods
	
	void fun(){
		System.out.println("This is fun");
	}
}*/


// RTP at its best
interface Shape{
	
	// When the object is created in the heap, constructor is called to initialize data in object
	// error
	/*Shape(){
		System.out.println("Shape Object Constructed");
	}*/
	// Neither user nor Run Time Environment can create the Object of interface
	
	
	// Its a rule i.e. a protocol which a child must define
	void draw(); // public abstract void draw();
	// thr can be n number of abstract methods, child must redefine all the abstract methods
	
	// No methods with definitions
	/*void fun(){
		System.out.println("This is fun");
	}*/
}

class Rectangle implements Shape{//extends Shape{ // Rectangle IS-A Shape
	
	Rectangle() {
		System.out.println("Rectangle Object Constructed");
	}
	
	// Overriding
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}

class Circle implements Shape{//extends Shape{ // Circle IS-A Shape
	
	Circle() {
		System.out.println("Circle Object Constructed");
	}
	
	// Overriding
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Triangle implements Shape{//extends Shape{ // Triangle IS-A Shape
	
	Triangle() {
		System.out.println("Triangle Object Constructed");
	}
	
	// Overriding
	public void draw(){
		System.out.println("Drawing a Triangle");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		Shape s; // reference to the shape object
		
		s = new Rectangle(); // Polymorphic Statement | RV of parent is having the reference to the child object
		s.draw(); // draw of child will be executed, rectangle will be drawn
		
		System.out.println("-----------------");
		
		s = new Circle();
		s.draw(); // draw of child will be executed, circle will be drawn
		
		System.out.println("-----------------");
		
		s = new Triangle();
		s.draw(); // draw of child will be executed, triangle will be drawn
		
		System.out.println("-----------------");
		
		//s = new Shape(); // error -> We cannot instantiate, i.e. we cannot create object of Shape
		//s.draw();
		
	}

}
