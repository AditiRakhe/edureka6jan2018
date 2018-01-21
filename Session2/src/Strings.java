
public class Strings {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		// String is a Reference Type. Its a buit in class in Java
		
		// Interned Way
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Non Interned Way. Object Way
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		// str1, str2, str3 and str4 are reference variables.
		
		if(str1 == str2){ // Comparing the reference variables. Address which comes out to be same
			System.out.println("str1 is equal to str2");
		}else{
			System.out.println("str1 is not equal to str2");			
		}
		
		if(str3 == str4){ // Comparing the reference variables. Address which not comes out to be same
			System.out.println("str3 is equal to str4");
		}else{
			System.out.println("str3 is not equal to str4");			
		}
		
		if(str1 == str3){
			System.out.println("str1 is equal to str3");
		}else{
			System.out.println("str1 is not equal to str3");			
		}
		
		// Comparing Content and not reference
		if(str3.compareTo(str4) == 0){  //str3.compareToIgnoreCase(str4)
			System.out.println("Strings are Equal");
		}
		
		if(str3.equals(str4)){  //str3.equalsIgnoreCase(str4)
			System.out.println("Strings are Equal");
		}
		
		// String are IMMUTABLE. They cannot be changed.
		
		String names = "John, Jennie, Jim, Jack, Joe";
		String[] arr = names.split(",");
		for(String s : arr){
			System.out.println(s.trim());
		}
		
		String s1 = names.toUpperCase();
		System.out.println("names is: "+names);
		System.out.println("s1 is: "+s1);
		
		String s2 = names.concat(", George, Harry");
		System.out.println(names);
		System.out.println(s2);
		
		System.out.println(names.length());
		
		char[] chArr = names.toCharArray(); // String to Array of Characters
		for(char c: chArr){
			System.out.print(c+" - ");
		}
		System.out.println();
		
		String s3 = names.substring(4);
		System.out.println(s3);
		String s4 = names.substring(0, 4);
		System.out.println("s4 is: "+s4);
		
		//String s5 = names.replace('J', 'K');
		String s5 = names.replace("Jo", "Ki");
		System.out.println(s5);
		
		if(names.contains("Jennie")){
			System.out.println("Jennie is in");
		}
		
		int idx = names.indexOf('J');
		System.out.println(idx);
		idx = names.lastIndexOf('J');
		System.out.println(idx);
		
		//if(names.endsWith("oe"))
		//if(names.startsWith("John"))
		
		char chr = names.charAt(3);
		System.out.println(chr);
		
		// Mutable Strings
		//1. StringBuilder 
		//2. StringBuffer  | Thread-Safe
		
		String str = new String("Hello");
		
		StringBuilder builder = new StringBuilder("Hello");
		StringBuffer buffer = new StringBuffer("Hello");
		
		str.concat(" Bye");
		builder.append(" Bye");
		buffer.append(" Bye");
		
		System.out.println("str is: "+str);
		System.out.println("builder is: "+builder);
		System.out.println("buffer is: "+buffer);

	}

}
