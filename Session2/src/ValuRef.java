
public class ValuRef {
	
	void prinI(int p){
		System.out.println("p is: "+p);
	}
	
	void printJ(int[] q){
		System.out.println("q is: "+q);
		q[2] = 100;
	}

	public static void main(String[] args) {
		
		// Primitive Type : Because it holds a value | Single Value Container
		int i = 10;
		
		// Reference Type : Because it holds address | Multi Value Container		
		int[] j = {10,20,30,40,50};
		
		System.out.println("i is: "+i);
		System.out.println("j is: "+j);
		
		ValuRef vRef = new ValuRef();
		
		vRef.prinI(i); // Passing the value
		vRef.printJ(j); // Passing the reference
		
		int k = i; // Copy Value
		int[] l = j; // Copy Reference 
		
		System.out.println("k is: "+k);
		System.out.println("l is: "+l);
		
		for(int e : l){
			System.out.println(e);
		}
	}

}
