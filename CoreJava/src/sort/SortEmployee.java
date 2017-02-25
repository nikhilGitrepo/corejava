package sort;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import classscope.AbstratClass;


/*  ..Priceline..
 *
 * What is difference between PATH and CLASSPATH?
 * 
 * How do you manage user session between 2 application servers? 
 * 	- if one server goes down, the current user sessions should not be lost.
 * 	- How will you achieve this?
 * 
 * How do you count the #times a method in Servlet?
 * 
 *  
 *
 */

public class SortEmployee {

	public static void main(String[] args) {
//		Map<Integer, Employee> emap = new HashMap<>();

		/*
		 * Using TreeMap : by default map is sorted based on {Key}
		 */
//		Map<Integer, Employee> emap = new TreeMap<>();

		/*
		 * Using TreeMap with external Comparator: 
		 * 	- map is sorted based on { EmployeeComparator.compare(..E1 , ..E2) }
		 */
//		Map<Employee,Integer> emap = new TreeMap<>( new EmployeeComparator() );
		
		Map<Employee,Integer> emap = new TreeMap<>();
		
		Employee m = new Employee("M", 27);
		Employee n = new Employee("N", 28);
		Employee a = new Employee("A", 30);
		Employee b = new Employee("B", 31);
		Employee k = new Employee("K", 50);
		Employee g = new Employee("G", 66);
		
		emap.put(n, n.getAge());emap.put(m, m.getAge());
		emap.put(a, a.getAge());emap.put(b, b.getAge());
		emap.put(k, k.getAge());emap.put(g, g.getAge());
		
		System.out.println("------------- Employee in Map ------------");
		
		System.out.println(emap);
		
//		System.out.println("------------- Employee in List ------------");
		
		List<Employee> el = new LinkedList<>();
		el.add(a);el.add(b);el.add(m);el.add(n);el.add(g);el.add(k);
		
		/*
		 * Collection.sort will sort based upon 
		 * @link{Comparable} implementation in Employee class
		 * 
		 * Collections.sort is only applicable if Comparable/Comparator is implemented for Employee
		 * 
		 * Use compareTo(...) implementation in Employee class
		 */
//		System.out.println("Calling Collections.sort(el) .. ");
//		Collections.sort(el);
		
		/*
		 * Collection.sort will sort based upon external/custom
		 * @link{sort.EmployeeComparator} implementation for Employee class
		 * 
		 * Override default sort
		 */
//		System.out.println("---------------------------------------------");
//		System.out.println("Calling Collections.sort(el, new EmployeeComparator()) .. ");
//		Collections.sort(el, new EmployeeComparator()); // sort by name
		
//		System.out.println(el);

	}

	/**
	 * Other topic: Object instantiation
	 */
	public void cannotInstantiateAbstractClass() {
		
//		Cannot instantiate abstract class
//		AbstratClass abstratClass = new AbstratClass("nikhil");
		
	}
	
}