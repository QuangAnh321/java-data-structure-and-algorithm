package section7.builtInHashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import section7.chaining.Employee;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jone", "Jones", 1);
		Employee johnDoe = new Employee("John", "Doe", 2);
		Employee marySmith = new Employee("Mary", "Smith", 3);
		Employee mikeWilson = new Employee("Mike", "Wilson", 4);
		
		Map<String, Employee> hashMap = new HashMap<String, Employee>();
		
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe", johnDoe);
		hashMap.put("Smith", marySmith);
//		System.out.println(hashMap.containsKey("Doe"));
//		System.out.println(hashMap.containsValue(marySmith));
		
//		Iterator<Employee> iterator = hashMap.values().iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		Employee employee = hashMap.put("Doe", mikeWilson);
		hashMap.putIfAbsent("Doe", mikeWilson);
//		System.out.println(employee);
		
		hashMap.forEach((k, v) -> System.out.println("Key = "+k+", Employee: "+v));
	}

}
