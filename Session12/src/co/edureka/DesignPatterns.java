package co.edureka;

class SingleTon{
	
	private static SingleTon ss = new SingleTon();
	
	private SingleTon(){
		System.out.println("SingleTon Object Created..");
	}
	
	static SingleTon getInstance(){
		return ss;
	}
}

public class DesignPatterns {

	public static void main(String[] args) {

		/*SingleTon s1 = new SingleTon();
		SingleTon s2 = new SingleTon();
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);*/
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);

	}

}
