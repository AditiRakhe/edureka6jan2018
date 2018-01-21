package co.edureka.cols;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, Employee> map2 = new HashMap<>();
		
		// Keys in the map are unique. they cannot be duplicated.
		map1.put(101, "John"); // Entry
		map1.put(311, "Jennie");
		map1.put(765, "Jim");
		map1.put(12, "Jack");
		map1.put(111, "Joe");
		
		// New Key will not be created
		map1.put(311, "Fionna"); // Update Operation in Map
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eid = 101;
		e1.name = "George";
		
		e2.eid = 201;
		e2.name = "Harry";
		
		map2.put(e1.eid, e1);
		map2.put(2, e2);
		
		System.out.println(map1);
		System.out.println(map2);
		
		System.out.println(map1.size());
		System.out.println(map2.size());
		
		String str = map1.get(311);
		System.out.println(str);
		
		if(map1.containsKey(311)){
			System.out.println("311 is having: "+map1.get(311));
		}
		
		if(map1.containsValue("Joe")){
			System.out.println("Joe is in the map");
		}
		
		map1.remove(311);
		
		System.out.println(map1);
		
		// HashMap accepts null values and null key
		map1.put(null, null);
		
		System.out.println(map1);
		
		// Iterate in Map
		// 1.
		Set<Integer> keys = map1.keySet();
		System.out.println("keys are: "+keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next(); // key
			String value = map1.get(key);
			
			System.out.println(key+" - "+value);
		}
		
		System.out.println("*****************************");
		
		//2.
		Set<Entry<Integer, String>> set = map1.entrySet();
		Iterator<Entry<Integer, String>> itr1 = set.iterator();
		
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(101, "John"); // Entry
		table.put(311, "Jennie");
		table.put(765, "Jim");
		table.put(12, "Jack");
		table.put(31, "Joe");
		System.out.println(table);
		
		keys = table.keySet();
		itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next(); // key
			String value = table.get(key);
			
			System.out.println(key+" - "+value);
		}
		
		// Explore
		// Sort User Defined Types (Employee eid,name) | Sort the employee on ids or names...
		// Comparator
		// Comaprable
	}

}
