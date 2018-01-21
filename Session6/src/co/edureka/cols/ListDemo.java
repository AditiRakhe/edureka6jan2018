package co.edureka.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

class Employee{
	int eid;
	String name;
	
	void showDetails(){
		System.out.println(eid+" belongs to "+name);
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		//1. Raw Type : Store any type of data | Hetrogeneous 
		ArrayList list1 = new ArrayList();
		
		//2. Generic Type : Store specific type of data | Homogeneous 
		ArrayList<String> list2 = new ArrayList<String>();
		//ArrayList<Integer> list2 = new ArrayList<Integer>(); // Not Primitives, But thr reference types (Wrappers)
		
		//3. Polymorphic Statement
		List<Employee> list3 = new ArrayList<Employee>();
		//list3 = new Vector<Employee>();
		
		
		// Add data in list
		//list1.add(0,100); // list1.add(new Integer(100)); // Its shall be AutoBoxed to an Object of tyoe Integer
		list1.add(100); // 0 
		list1.add("John"); // 1
		list1.add("Jennie"); // 2
		list1.add(2.2);// 3
		list1.add('A'); //4
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "George";
		
		Employee e2 = new Employee();
		e2.eid = 201;
		e2.name = "Fionna";
		
		list1.add(e1); // 5
		list1.add(e2); // 6
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Joe");
		//list2.add(e1); // err
		//list2.add(2.2); // err
		
		list3.add(e1);
		list3.add(e2);
		
		// Read data in list
		System.out.println("list1 is : "+list1+" size is: "+list1.size());
		System.out.println("list2 is : "+list2+" size is: "+list2.size());
		System.out.println("list3 is : "+list3+" size is: "+list3.size());
		
		// Read a single element from list
		System.out.println(list1.get(0));
		
		// Iterate in the List
		//1. For Loop
		System.out.println("**********For Loop**********");
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		System.out.println("===========================");
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		System.out.println("===========================");
		for(int i=0;i<list3.size();i++){
			list3.get(i).showDetails();
		}
		
		//2. Enhanced For Loop
		System.out.println("**********Enhanced For Loop**********");
		for(Object o : list1){
			System.out.println(o);
		}
		System.out.println("===========================");
		for(String str : list2){
			System.out.println(str);
		}
		System.out.println("===========================");
		for(Employee emp : list3){
			emp.showDetails();
		}
		
		//3. Iterator
		System.out.println("**********Iterator**********");
		Iterator<Object> itr1 = list1.iterator();
		Iterator<String> itr2 = list2.iterator();
		Iterator<Employee> itr3 = list3.iterator();
		
		while(itr1.hasNext()){
			Object o = itr1.next();
			System.out.println(o);
		}
		
		System.out.println("===========================");
		while(itr2.hasNext()){
			String str = itr2.next();
			System.out.println(str);
			
			if(str.equals("John"))
				itr2.remove(); // remove the element from list with iterator itself
		}
		
		System.out.println("===========================");
		while(itr3.hasNext()){
			Employee emp = itr3.next();
			emp.showDetails();
		}
		
		//4. ListIterator
		System.out.println("**********ListIterator**********");
		
		ListIterator<String> itr4 = list2.listIterator();
		
		while(itr4.hasNext()){
			String str = itr4.next();
			System.out.println(str);
		}
		System.out.println("===========================");
		while(itr4.hasPrevious()){
			String str = itr4.previous();
			System.out.println(str);
		}
		
		//5. Enumeration
		System.out.println("**********Enumeration**********");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String str = enm.nextElement();
			System.out.println(str);
		}
		
		System.out.println("===========================");
		System.out.println("===========================");
		
		System.out.println(list2);

		// Update data in list
		list2.set(1, "Fionna");
		System.out.println(list2);
		
		// remove data from list
		list2.remove(1);
		System.out.println(list2);
		
		//list2.clear();
		//System.out.println(list2);
		
		ArrayList<String> list4 = new ArrayList<>(); // Not Thread-Safe
		list4.add("Fionna");
		list4.add("George");
		list4.add("Harry");
		list4.add("Fionna");
		
		// Merge 2 lists
		list2.addAll(list4);
		System.out.println(list2);
		
		// Operations | Explore API's on list
		if(list2.contains("Fionna")){
			System.out.println("Fionna is in the list");
		}
		
		//int idx = list2.indexOf("Fionna");
		int idx = list2.lastIndexOf("Fionna");
		System.out.println(idx);
		
		//if(list2.isEmpty()) | if(list2.size()==0)
		
		Vector<String> vector = new Vector<>(); // Thread-Safe Version
		vector.add("Fionna"); // 0
		vector.add("George");
		vector.add("Harry");
		vector.add("Fionna"); // n-1
		System.out.println("vector is: "+vector+" size is: "+vector.size());
		
		LinkedList<String> list = new LinkedList<>();
		Stack<String> stack = new Stack<>();
		
	}

}
