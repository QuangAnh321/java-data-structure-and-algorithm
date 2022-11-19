package section7.linearProbing;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jone", "Jones", 1);
		Employee johnDoe = new Employee("John", "Doe", 2);
		Employee marrySmith = new Employee("Mary", "Smith", 3);
		Employee mikeWilson = new Employee("Mike", "Wilson", 4);
		Employee billEnd = new Employee("Bill", "End", 5);
		
		ArrayHashtable ht = new ArrayHashtable();
		
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marrySmith);
		
		ht.printHashTable();
		
		System.out.println();
		
		System.out.println("Retrieve key Wilson: "+ht.get("Wilson"));
		System.out.println("Retrieve key Smith: "+ ht.get("Smith"));
		
		ht.remove("Wilson");
		ht.remove("Jones");
		ht.printHashTable(); 
		
		System.out.println("Retrieve key Smith: "+ ht.get("Smith"));
	}
}
