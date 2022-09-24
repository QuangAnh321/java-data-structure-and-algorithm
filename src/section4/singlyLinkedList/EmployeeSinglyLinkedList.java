package section4.singlyLinkedList;

import section4.Employee;

public class EmployeeSinglyLinkedList {

	private EmployeeNode head;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.println("HEAD -> ");
		
		while (current != null) {
			System.out.println(current);
			System.out.println("-> ");
			current = current.getNext();
		}
		
		System.out.println("null");
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		return removedNode;
	}
}
