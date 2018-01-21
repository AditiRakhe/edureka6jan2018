import java.util.Scanner; // API | Application Programming Interfaces

public class InputFromUser {

	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	public static void main(String[] args) {
		
		InputFromUser iRef = new InputFromUser();
		//iRef.printTable(5);
		
		Scanner scanner = new Scanner(System.in); // Read from Console
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		iRef.printTable(n);
		
 	}

}
