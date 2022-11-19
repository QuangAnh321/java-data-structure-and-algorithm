package section7.chaining;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jone", "Jones", 1);
		Employee johnDoe = new Employee("John", "Doe", 2);
		Employee marrySmith = new Employee("Mary", "Smith", 3);
		Employee mikeWilson = new Employee("Mike", "Wilson", 4);
		
		ChainedHashtable ht = new ChainedHashtable();
		
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marrySmith);
		
//		ht.printHashTable();
		
		ht.remove("Doe");
		ht.remove("Jones");
		ht.printHashTable();  
		
		System.out.println("Retrieve key Smith: "+ ht.get("Smith"));
	}
}
