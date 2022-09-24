package section4.doublyLinkedList;

import section4.Employee;

public class Main {

	public static void main(String[] args) {
		Employee janeDoe = new Employee("Jane", "Doe", 1);
		Employee johnDoe = new Employee("John", "Doe", 2);
		Employee marrySmith = new Employee("Marry", "Smith", 3);
		Employee mikeWilson = new Employee("Mike", "Wilson", 4);
		Employee quangAnhVu = new Employee("Quang Anh", "Vu", 5);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		list.addToFront(janeDoe);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println("");
		
		list.addToBack(quangAnhVu);
		list.printList();
		System.out.println("");
		
		list.removeFromBack();
		list.printList();
	}

}
