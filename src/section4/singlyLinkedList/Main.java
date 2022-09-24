package section4.singlyLinkedList;

import section4.Employee;

public class Main {

	public static void main(String[] args) {
		Employee janeDoe = new Employee("Jane", "Doe", 1);
		Employee johnDoe = new Employee("John", "Doe", 2);
		Employee marrySmith = new Employee("Marry", "Smith", 3);
		Employee mikeWilson = new Employee("Mike", "Wilson", 4);
		
		EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();
		
		list.addToFront(janeDoe);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
	}

}
