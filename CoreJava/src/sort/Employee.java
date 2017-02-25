package sort;

public class Employee implements Comparable<Employee>{

	private String name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public String toString() {
		return "Employee [name=" + name + ", age=" + age +  ", hashCode=" + this.hashCode() + "]\n";
	}

	@Override
	public int compareTo(Employee o) {
		int diff = this.age-o.age;
		if(diff > 0) {
			return 1;
		}else if(diff < 0) {
			return -1;
		}else {
			return 0;
		}
	}

	/*@Override
	public int compareTo(Employee o) {
		if(this.age > o.age) {
			return -1;
		}else if(this.age < o.age) {
			return 1;
		}else {
			return 0;
		}
		
		return this.hashCode()-o.hashCode();
	}*/

}
