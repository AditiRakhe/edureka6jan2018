class Table{
	
	//synchronized void printTable(int num){ // A lock shall be acquired by a thread
	void printTable(int num){ // Not Synchronized
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	} // lock is released once execution is finished
	
	void fun1(){
		
	}
	
	
	void fun2(){
		
	}
	
}

class MyThread extends Thread{
	
	Table tRef;
	
	MyThread(Table s){
		tRef = s; // Reference Copy. tRef, s and t points to the same object
	}
	
	public void run() {
		
		synchronized (tRef) {
			tRef.printTable(7);
		}
	}
	
}

class YourThread extends Thread{
	
	Table tRef;
	
	YourThread(Table s){
		tRef = s; // Reference Copy. tRef, s and t points to the same object
	}
	
	public void run() {
		synchronized (tRef) {
			tRef.printTable(9);
			tRef.fun1();
			tRef.fun2();
		}
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started");

		Table t = new Table(); // t is a reference variable. It points to an Object ot Table
		//t.printTable(5); 	   // main method prints table of 5
		
		// MyThread and YourThread are accessing the same single object of Table
		
		MyThread mRef = new MyThread(t);
		YourThread yRef = new YourThread(t);
		
		// Default Behavior is that threads run concurrently, i.e. ASYNCHRONOUSLY
		mRef.start();
		yRef.start();
		
		System.out.println("Main Finished");
		
	}

}
