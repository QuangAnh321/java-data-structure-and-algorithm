package section4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane", "Doe", 1));
		employeeList.add(new Employee("Jone", "Doe", 2));
		employeeList.add(new Employee("Mary", "Smith", 3));
		employeeList.add(new Employee("Mike", "Wilson", 4));
		
		employeeList.forEach(employee -> System.out.println(employee));
		
//		System.out.println();
//		System.out.println(employeeList.get(1));
//		
//		employeeList.set(1, new Employee("Quang Anh", "Vu", 2));
//		
//		System.out.println();
//		System.out.println(employeeList.get(1));
		
		employeeList.add(2, new Employee("Edward", "Baldwin", 3));
		employeeList.forEach(employee -> System.out.println(employee));
	}

}
