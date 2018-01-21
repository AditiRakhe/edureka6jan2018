
public class Loops {

	public static void main(String[] args) {
		
		int num = 5;
		
		/*
		System.out.println(num+" 1's are "+(num*1));
		System.out.println(num+" 2's are "+(num*2));
		System.out.println(num+" 3's are "+(num*3));
		System.out.println(num+" 4's are "+(num*4));
		System.out.println(num+" 5's are "+(num*5));
		*/
		
		for(int i=100; i<=10; i++){
			
			if(i>5){
				break;
			}
			
			System.out.println(num+" "+i+"'s are "+(num*i));
			
		}
		
		System.out.println("-----------------");
		
		num = 7;
		int j = 100;
		
		while(j<=10){
			
			j++;
			
			if(j<5){
				continue;
			}
			
			System.out.println(num+" "+j+"'s are "+(num*j));
			
		}
		
		
		System.out.println("-----------------");
		
		num = 9;
		j = 100;
		do{
			System.out.println(num+" "+j+"'s are "+(num*j));
			j++;
		}while(j<=10);
		
		
		System.out.println("-----------------");
		
		// Nesting of loops
		
		outer:
		for(int p=1;p<=5;p++){
			System.out.println("p is: "+p);
			
			inner:
			for(int q=1;q<=3;q++){
				System.out.print(q+" ");
				
				if(q>1){
					break outer;
				}
				
			}
			System.out.println();
		}
			
	}

}
