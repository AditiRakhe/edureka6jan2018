
public class IfElse {

	public static void main(String[] args) {
		
		boolean isInternetConnected = true;
		boolean isGPSConnected = false;
		
		// Nested if/else
		if(isInternetConnected){
			if(isGPSConnected){
				System.out.println("Open the App");
			}else{
				System.out.println("Please connect to the GPS and retry !!");
			}
		}else{
			System.out.println("Please connect to the Internet and retry !!");
		}
		
		int num1 = 100;
		int num2 = 200;
		
		if(num1 > num2){
			System.out.println("num1 is greater");
		}else{
			System.out.println("num2 is greater");
		}
		
		// if/else
		
		int balance = 1000;
		if(balance>2000){
			System.out.println("You can Withdraw");
		}else{
			System.out.println("You cannot Withdraw");
		}
		
		// Ladder if/else
		
		int avgMarks = 70;
		
		if(avgMarks >= 80){
			System.out.println("Grade A is Awarded");
		}else if(avgMarks>=70 && avgMarks<80){
			System.out.println("Grade B is Awarded");
		}else if(avgMarks>=60 && avgMarks<70){
			System.out.println("Grade C is Awarded");
		}else{
			System.out.println("Grade D is Awarded");
		}

	}

}
