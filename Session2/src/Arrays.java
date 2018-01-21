
public class Arrays {

	public static void main(String[] args) {
		
		// Single Value Container
		int i = 10;
		
		//int j = 10,20; // error
		
		
		// Multi Value Container | Array | Homogeneous in nature
		int[] k = {10,20,30,40,50};  // Implicit Statement
		
		// k is a reference variable in stack which is pointing to an array in the heap

		System.out.println("i is: "+i);
		System.out.println("k is: "+k);
		
		
		int[] l = new int[]{10,20,30,40,50}; // Explicit Statement
		// new creates array dynamically, i.e. at run time 
		
		// Array with 5 elements having all values as 0
		int[] m = new int[5];
		
		int n[] = new int[5];
		
		int a1[],a2[],a3[];
		int[] a4,a5,a6;
		
		a1 = new int[3];
		a4 = new int[3];
		
		// Read and Write
		
		// Read Operation
		System.out.println(k[0]); // 1st index
		System.out.println(k[4]); // n-1 index
		
		// Read All
		int len = k.length; // property which give length of an array
		
		System.out.println("len is: "+len);
		for(int idx=0;idx<len;idx++){
			System.out.print(k[idx]+"  ");
		}
		
		System.out.println();
		
		// Enhanced For Loop | For-Each Loop
		// Works with Arrays
		for(int elm : m){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		// Write Data
		m[0] = 12;
		m[1] = 89;
		m[2] = 23;
		m[3] = 43;
		m[4] = 56;
		
		for(int elm : m){
			System.out.print(elm+"  ");
		}
		
		// Since Arrays are created at run time, you will get an error at run time and not at compile time
		System.out.println("m[10] is: "+m[10]);
	}

}
