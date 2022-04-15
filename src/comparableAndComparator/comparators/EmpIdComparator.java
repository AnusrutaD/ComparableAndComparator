package comparableAndComparator.comparators;

import java.util.Comparator;

import comparableAndComparator.entity.Employee;

public class EmpIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId() - o2.getEmpId();
	}

}
