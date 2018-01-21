import java.lang.Thread.State;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("**MyTask** "+i);
		}
	}
}*/

//1. Extending Thread Class
/**
 * 
 * @author ishantkumar
 * This is demo to Threads.
 */
class MyTask extends Thread{
	
	/**
	 * @param name
	 */
	MyTask(String name){
		super(name); 
	}
	
	public void run(){    		// Overriding the run method of thread class
		for(int i=1;i<=10;i++){
			
			// Killing a Thread
			if(i==5)
				break;
			
			try {
				Thread.sleep(1000); // 1000 milli secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("**MyTask** "+i);
		}
	}
}

//2. Implementing Runnable Interface
class YourTask implements Runnable{
	public void run(){    		// Overriding the run method of runnable interface
		
		Thread.yield(); // Request, execute my tasks later, let others execute thr tasks first
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000); // 1000 milli secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("@@YourTask@@ "+i);
		}
	}
}

class A{
	
}

/*class B extends A,Thread{ // error | Multiple Inheritance is not supported
	public void run(){
		
	}
}*/

class B extends A implements Runnable{ 
	public void run(){
		
	}
}

// Statements written in the run method shall execute parllely to the main method

public class ThreadsDemo {

	// All the tasks to be performed by main thread must be written
	// in the main method
	public static void main(String[] args) {
		System.out.println("App Started");

		System.out.println("This is Hello from Edureka");
		
		MyTask mt = new MyTask("John");		// Blocker to the main
		//mt.executeTask();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread th = new Thread(r); 
		
		mt.setPriority(Thread.MAX_PRIORITY); // 10
		th.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		mt.setDaemon(true); // JVM will not exit until daemon thread is finished
		
		mt.start(); // start method of thread class, internally calls the run method | State Management of Threads
		
		// command, which says, execute my jobs first and let others wait
		try {
			mt.join(); // join has to be called immediately after the start method
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		th.start();
		
		
		th.setName("Jim");
		Thread.currentThread().setName("Jennie");
		
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000); // 1000 milli secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("==Main Thread== "+i);
		}
		
		System.out.println("mt name is: "+mt.getName());
		System.out.println("th name is: "+th.getName());
		System.out.println("main name is: "+Thread.currentThread().getName()); // main thread i.e. main method
		
		System.out.println("mt priority is: "+mt.getPriority());
		System.out.println("th priority is: "+th.getPriority());
		System.out.println("main priority is: "+Thread.currentThread().getPriority()); // main thread i.e. main method
		
		System.out.println("App Finished");
		
		//Thread.State.NEW
		//Thread.State.RUNNABLE
		//Thread.State.WAITING
		//Thread.State.TIMED_WAITING
		//Thread.State.BLOCKED
		
		//if(th.getState() == Thread.State.BLOCKED){
		//	
		//}
		
	}

}
