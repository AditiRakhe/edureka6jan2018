
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// Calculate population of a state. We need to store the data.
		// Data will have dimensions.
		// State is divided into cities
		
		int [] karnataka = {100,200,300,400,500,600,700,123,456};
		int [] punjab = {321,200,456,400,500,456,987,123,678};
		
		int kPop = 0, pPop = 0;
		
		for(int p : karnataka){
			kPop = kPop+p;
		}
		
		for(int p : punjab){
			pPop = pPop+p;
		}
		
		System.out.println("Population of karnataka is "+kPop);
		System.out.println("Population of punjab is "+pPop);
		
		// Calculate population of a Country. We need to store the data.
		// Data will have multiple dimensions.
		// Country is divided into states
		// State is divided into cities
		
		// Array of Arrays
		int[][] countryData = {
									{100,200,300,400,500,600,700,123,456},	// 0th Array
									{321,200,456,400,500,456,987,123,678},	// 1st Array
									{321,200,456,400},						// 2nd
									{321,200,456,400,500,456},				// 3rd
									{321,200}								// 4th
							  };
		
		System.out.println("Size of countryData is: "+countryData.length); // 5
		System.out.println("Size of countryData is: "+countryData[0].length); // 9
		System.out.println("Size of countryData is: "+countryData[4].length); // 2
		

		System.out.println(countryData[2][0]); // 321
		System.out.println(countryData[3][3]); // 400
		System.out.println(countryData[1][4]); // 500
		
		// Calculate the population
		int cPop = 0;
		
		for(int i=0;i<countryData.length;i++){ // 5 times, 0 to 4
			for(int j=0;j<countryData[i].length;j++){
				System.out.print(countryData[i][j]+"  ");
				cPop = cPop+countryData[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Country Population is: "+cPop);
		
		System.out.println("------------------");
		
		// Enhanced For Loop
		for(int[] a1 : countryData){
			for (int e : a1) {
				System.out.print(e+"  ");
			}
			System.out.println();
		}
		
		// Array of Array of Arrays
		int[][][] worldData = {
								// 0th index
								{
										{100,200,300,400,500,600,700,123,456},	// 0th Array
										{321,200,456,400,500,456,987,123,678},	// 1st Array
										{321,200,456,400},						// 2nd
										{321,200,456,400,500,456},				// 3rd
										{321,200}								// 4th
		  						},
								// 1st index
								{
										{100,200,300,400,500,600,700,123,456},	// 0th Array
										{321,200,456,400,500,456,987,123,678},	// 1st Array
										{321,200,456,400},						// 2nd
										{321,200,456,400,500,456},				// 3rd
										{321,200}								// 4th
								}
							 };	
		System.out.println("worldData[0][0][3]: "+worldData[0][0][3]);
		
		int[][] a2 = new int[5][5]; // This is not 5 rows and 5 columns. This is 5 Arrays with each having 5 elements.
		int[][] a3 = new int[5][]; //  This is 5 Arrays.
		a3[0] = new int[7];        // a3's 0th array will gave 7 elements
		a3[1] = new int[10];        // a3's 1st array will gave 10 elements
							
		// Write Data
		a2[0][0] = 100;
		
		System.out.println("a2 is: "+a2);
		
		// Arrays are reference types
		
	}

}
