package co.edureka.exceptions;

import java.io.IOException;

// User Defined Exception
class BankingException extends RuntimeException{ // UnCheckedException
	BankingException(String message) {
		super(message);
	}
}

class BankingExceptionAgain extends Exception{ // CheckedException
	BankingExceptionAgain(String message) {
		super(message);
	}
}

class Banking{
	
	int balance = 10000;
	int minBal = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance-amt;
		
		if(balance<=minBal){
			balance = balance + amt;
			System.out.println("Withdrawl Failure and Balance is LOW: \u20b9"+balance+" so cannot withdraw \u20b9"+amt);
			
			attempts++;
			
			if(attempts == 3){
				// Throwing an UnChecked Exception
				//ArithmeticException ae = new ArithmeticException("Invalid Withdrawl Requests");
				//throw ae;
				BankingException be = new BankingException("Invalid Withdrawl Requests");
				throw be;
			}
			
		}else{
			System.out.println("Withdrawl Successful and Balance is: \u20b9"+balance);
		}
		
	}
	
	void withdrawAgain(int amt) throws IOException{
		
		balance = balance-amt;
		
		if(balance<=minBal){
			balance = balance + amt;
			System.out.println("Withdrawl Failure and Balance is LOW: \u20b9"+balance+" so cannot withdraw \u20b9"+amt);
			
			attempts++;
			
			if(attempts == 3){
				// Throwing an Checked Exception
				IOException io = new IOException("Invalid Withdrawl Requests");
				throw io;
			}
			
		}else{
			System.out.println("Withdrawl Successful and Balance is: \u20b9"+balance);
		}
		
	}
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Banking Started...");
		
		Banking bRef = new Banking();
		
		for(int i=1;i<=100;i++){
			bRef.withdraw(3000);
		}
		
		/*try {
			for(int i=1;i<=10;i++){
				bRef.withdrawAgain(3000);
			}
		} catch (IOException e) {
			System.out.println("Exception: "+e);
		}*/
				
		System.out.println("Banking Finished...");
	}

}
