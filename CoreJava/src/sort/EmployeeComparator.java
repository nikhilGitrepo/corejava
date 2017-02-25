package sort;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		/*
		 * Sort by Employee Name : java.lang.String.compareTo(..)
		 */
		return o1.getName().compareTo(o2.getName());
		
		
		/* 
		 * Default compare : 
		 */
//		return compare(o1, o2);
		
	}

}
