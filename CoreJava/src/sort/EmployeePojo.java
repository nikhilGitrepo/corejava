package sort;

import java.util.Comparator;

public class EmployeePojo implements Comparator<EmployeePojo>{

	private String name;
	private int age;
	
	public EmployeePojo(String name, int age) {
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
		return "EmployeePojo [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public int compare(EmployeePojo o1, EmployeePojo o2) {
		return 0;
	}

}
