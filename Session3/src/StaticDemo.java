class Counter{
	
	int count;// non static is the property of Object.
	
	static int sCount; // static is not the property of Object.
	// static is the property of class
	
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	// Property of Object can access the property of Class
	void incrementCount(){
		count++;
		sCount++;
	}
	
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("sCount is: "+sCount);
	}
	
	// static is the property of class, not the property of Object.
	static void showSCount(){
		//System.out.println("count is: "+count); // error | Property of Object cannot be accessed by property of class
		System.out.println("sCount is: "+sCount);
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
	
		Counter c1 = new Counter(); // 1  1
		Counter c2 = new Counter(); // 1  1
		
		Counter c3 = c1; // reference copy
		
		c1.incrementCount(); // 2   2
		c2.incrementCount(); // 2   3
		c3.incrementCount(); // 3   4
		c3.incrementCount(); // 4   5
		c2.incrementCount(); // 3   6
		c1.incrementCount(); // 5   7

		c1.showCount(); //5 7
		System.out.println("-----------------");
		c2.showCount(); //3 7
		System.out.println("-----------------");
		c3.showCount(); //5 7
		System.out.println("-----------------");
		
		/*Counter.sCount = 10;
		
		c1.sCount = 100; // c1 modified the value of sCount 
		c2.sCount = 200;
		
		Counter.showSCount();
		c1.showSCount();
		c2.showSCount();*/
		
		Counter.showSCount();
	}

}
