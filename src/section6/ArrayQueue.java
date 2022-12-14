package section6;

import java.util.NoSuchElementException;

// Not finished
public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	// back pointer always points to the next available position at the back
	public void add(Employee employee) {
		if (size() == queue.length - 1) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}
		
		queue[back] = employee;
		if (back < queue.length - 1) {
			back++;
		} else {
			back = 0;
		}
		
	}
	
	// front  pointer always points to the first  position at the front
	public Employee remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		
		Employee employee = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		}
		
		return employee;
	}
	
	public Employee peek() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		
		return queue[front];
	}
	
	public int size() {
		return back - front;
	}
	
	public void printQueue() {
		for (int i = front; i < back; i++) {
			System.out.println(queue[i]);
		}
	}
}
