package section4.doublyLinkedList;

import section4.Employee;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
		}
		
		node.setNext(head);
		head = node;
		
		size++;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.println("HEAD -> ");
		
		while (current != null) {
			System.out.println(current);
			System.out.println("<-> ");
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
		
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size--;
		return removedNode;
	}
	
	public void addToBack(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		
		tail = node;
		size++;
	}
	
	public EmployeeNode removeFromBack() {
		if (isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = tail;
		
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getPrevious();
		size--;
		return removedNode;
	}
}
