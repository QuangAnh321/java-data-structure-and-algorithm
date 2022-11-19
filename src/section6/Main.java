package section6;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jone", "Jones", 1);
		Employee johnDoe = new Employee("John", "Doe", 2);
		Employee marrySmith = new Employee("Mary", "Smith", 3);
		Employee mikeWilson = new Employee("Mike", "Wilson", 4);
		Employee billEnd = new Employee("Bill", "End", 5);
		
		ArrayQueue queue = new ArrayQueue(5);
		
		System.out.println("In here");
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.remove();
		queue.add(marrySmith);
		queue.remove();
		queue.add(mikeWilson);
//		queue.remove();
//		queue.add(billEnd);
//		queue.remove();
//		queue.add(janeJones);
		
		System.out.println("Done");
		
		queue.printQueue();
		
		System.out.println("Done 2");
	}
}
