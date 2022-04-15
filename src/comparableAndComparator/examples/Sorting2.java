package comparableAndComparator.examples;

import java.util.ArrayList;
import java.util.Collections;

import comparableAndComparator.comparators.EmpNameComparator;
import comparableAndComparator.entity.Employee;

public class Sorting2 {

	public static void main(String[] args) {
		// Sorting Example-2 by using Arraylist of Employees
		ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("Anusruta", "9876543210", 1005));
        emps.add(new Employee("Vikash", "9876543210", 1002));
        emps.add(new Employee("Rajesh", "9876543210", 1006));
        emps.add(new Employee("Abhishek", "9876543210", 1001));
        emps.add(new Employee("Priya", "9876543210", 1003));
        emps.add(new Employee("Akanksha", "9876543210", 1007));
        emps.add(new Employee("Prithvi", "9876543210", 1004));
        System.out.println("Before sort: ");
        System.out.println(emps);
        //Sort by name by using compare method of Comparator
        Collections.sort(emps, new EmpNameComparator());
        System.out.println("After sort: ");
        System.out.println(emps);
	}

}
