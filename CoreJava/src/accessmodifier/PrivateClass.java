package accessmodifier;

class PrivateClass2 {

	private String name;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	private void accessPrivateMethod(){
		getName(); 		// public  method
		setName("");	// private method
	}
	
}

public class PrivateClass {
	public static void main(String[] args) {
		PrivateClass2 pc = new PrivateClass2();

		pc.getName(); 		// public  method
//		pc.setName("");		// private method - not accessible
	}
}