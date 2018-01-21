package co.edureka.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Applicaiton Started...");
		
		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println("arr[20] is: "+arr[20]); // arr[20] does not exists
		}catch(ArrayIndexOutOfBoundsException ai){
			//System.out.println("Some Exception: "+ai);
			//System.out.println("Message: "+ai.getMessage());
			//ai.printStackTrace();
			System.out.println("OOPS! Some Error Occured!!");
		}
	
		
		int a=10,b=0,c=0;
		
		try{
			c = a/b;
		}/*catch(ArithmeticException ae){
			System.out.println("Some Arithmetic Div by 0 Error Occured !!");
		}*/catch(Exception ae){ // Polymorphism at Run Time
			System.out.println("Some Arithmetic Div by 0 Error Occured !!");
		}finally{
			System.out.println("Execution is Important");
		}
		
		
		System.out.println("c is: "+c);
		
		
		
		for(int i=1;i<=10;i++){
			System.out.println("5 "+i+"'s are "+(5*i));
		}
		
		
		System.out.println("Applicaiton Finished...");
	}

}
