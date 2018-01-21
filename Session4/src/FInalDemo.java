//final class A{ // final class cannot be extended
class A{
	final void show(){ // final method cannot be overrided
		
	}
}

class B extends A{ //err
	//void show(){ //err //overriding
		
	//}
	
	void show(int x){ //overloading
		
	}
}


public class FInalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100; // it works

		final int j = 10;
		//j = 100; // error
		
	}

}
