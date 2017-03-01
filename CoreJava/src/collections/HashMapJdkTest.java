package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapJdkTest {

	public static void main(String[] args) {
		
		Employee e1_1 = new Employee(1, "nikhil", 27);
		Employee e11 = new Employee(1, "nikhil", 27);
		
		Employee e2_1 = new Employee(2, "Kirti", 50);
		
		Map<Employee, Employee> employees = new HashMap<>();
		Map<Integer, Employee> employeesIntKey = new HashMap<>();
		Map<String, Employee> employeesStringKey = new HashMap<>();
		
		/*
		 * We get different hashCodes on calling obj.hashCode() 
		 * with overriding hashCode and equals method
		 * 
		 * If overridden, then same hashCodes are generated
		 * 
		 */
		System.out.println("e1_1 : " + e1_1.hashCode());
		System.out.println("e1_2 : " + e11.hashCode());
		System.out.println("e2_1 : " + e2_1.hashCode());
		
		employees.put(e1_1, e1_1);
		employees.put(e11, e11);
		
		employees.put(e2_1, e2_1);
// --------------------------------------------------------		
		employeesIntKey.put(1, e1_1);
		employeesIntKey.put(1, e11);
		
		employeesIntKey.put(2, e2_1);
// --------------------------------------------------------
/*		String e11 = new String("e1");
		String e12 = new String("e1");
		String e21 = new String("e2");
		employeesStringKey.put(e11, e1_1);
		employeesStringKey.put(e12, e11);
		
		employeesStringKey.put(e21, e2_1);
*/
// --------------------------------------------------------		
		System.out.println("------------------------");
		System.out.println("size: " + employees.size());
		System.out.println("HM e1_1 : " + employees.get(e1_1).hashCode());
		System.out.println("HM e1_2 : " + employees.get(e11).hashCode());
		System.out.println("HM e2_1 : " + employees.get(e2_1).hashCode());
		System.out.println("------------------------");
/*
		System.out.println("size: " + employeesIntKey.size());
		System.out.println("HM' e1_1 : " + employeesIntKey.get(1).hashCode());
		System.out.println("HM' e2_1 : " + employeesIntKey.get(2).hashCode());*/
		System.out.println("------------------------");

/*		System.out.println("size: " + employeesStringKey.size());
		System.out.println("HM'' e1_1 : " + employeesStringKey.get(e11).hashCode());
		System.out.println("HM'' e1_2 : " + employeesStringKey.get(e12).hashCode());
		System.out.println("HM'' e2_1 : " + employeesStringKey.get(e21).hashCode());*/
		
	}

	/**
	 * 2 important observations:
	 * 
	 * 1) The inner class can be public even though file_name is different( i.e., HashMapJdkTest )
	 * 2) getOuterType() method in the inner class
	 * 
	 * @author ultimate
	 *
	 */
/*	public class Employee {
		
		private int id;
		private String name;
		private int age;

		public Employee(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + age;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (age != other.age)
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private HashMapJdkTest getOuterType() {
			return HashMapJdkTest.this;
		}
		
	}*/
	
	class EmployeeInner {
		
	}
	
	static class EmployeeInnerStatic {
		
	}
	
}

class Employee {
	
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}