package co.edureka.cols;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> set1 = new HashSet<>(); // Generic Type
		Set<Employee> set2 = new HashSet<>(); // Polymorphic
		Set set3 = new HashSet(); // Polymorphic
		
		TreeSet<String> set1 = new TreeSet<>();
		
		// Hashing Algo is used to store the data in HashSet
		set1.add("John"); // HashCodes
		set1.add("Jennie");
		set1.add("Jim");
		set1.add("Jack");
		set1.add("John");
		set1.add("Jennie");
		set1.add("Joe"); 
		
		System.out.println("set1 is: "+set1+" and size is: "+set1.size());

		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}
		
		set1.remove("John");
		System.out.println(set1);
		
		if(set1.contains("Jennie"))
			System.out.println("Jennie is in the set");
	}

}
