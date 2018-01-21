class Point{
	
	// Attributes
	int x;
	int y;
	
	// Constructor - Default
	Point(){
		x = 100;
		y = 120;
	}
	
	// Constructor - Parmeterized | Overloaded
	Point(int p, int q){
		x = p;
		y = q;
	}
	
	// Methods
	void showPoint(){
		System.out.println("Point is: "+x+" : "+y);
	}
}

public class ConstrcutroDemo {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(11,22);
		
		p1.showPoint();
		p2.showPoint();

	}

}
