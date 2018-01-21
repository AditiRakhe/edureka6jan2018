class Message{
	
	String msg = "No Message Available !!";
	
	void writeMessage(){
		msg = "Search the Candle, Rather than cursing the darkness !!";
		System.out.println("--Message Written--");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
}

class Reader extends Thread{
	
	Message m;
	
	Reader(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			
			try {
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
}

class Writer extends Thread{
	
	Message m;
	
	Writer(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			m.writeMessage();
			//m.notify();
			m.notifyAll();
		}
	}
}


public class WNDemo {

	public static void main(String[] args) {
		
		Message m = new Message(); // Reader and Writer Threads shall work on same single object

		Reader r1 = new Reader(m);
		Reader r2 = new Reader(m);
		Writer w = new Writer(m);
		
		r1.start();
		r2.start();
		w.start();
		
	}

}
