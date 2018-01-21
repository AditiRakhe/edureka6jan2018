import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Util {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String dt = sdf.format(date);
		System.out.println(dt);

		int num1=0, num2=0, num3=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1");
		num1 = scanner.nextInt();
		System.out.println("Enter Number 2");
		num2 = scanner.nextInt();
		
		num3 = num1+num2;
		System.out.println("num3 is: "+num3);
		
		scanner.close();
	}

}
