package co.edureka.threads;

/*class MyTask{
	
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("##MyTask## "+i);
		}
	}
}*/

class MyTask extends Thread{
	
	// Override the run method and mention all the jobs to be performed here
	// run method will be executing jobs parallel to the main method
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("##MyTask## "+i);
		}
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		
		
		//MyTask mRef = new MyTask(); // Blocker Job for Main
		//mRef.executeTask();		
		
		MyTask mRef = new MyTask(); // Blocker Job for Main
		mRef.start(); // start method internally calls the run method		
		
		for(int i=1;i<=10;i++){
			System.out.println("==Main Thread== "+i);
		}
		
		System.out.println("Main Finished...");
	}

}
