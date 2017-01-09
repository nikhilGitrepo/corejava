package oopconcepts;

public class TestOverriding {

	public static void main(String[] args) {
		
		// No compiler error
		// throws RUNTIME error
		Child child =(Child) new Parent();
//		child.methodOne();
		
		// Parent and access their child from anywhere 
		// BUT access is limited or defined by the Access modifier of method/variable
		// Parent CAN refer Child Object
		Parent parent = new Child();
		parent.methodOne();
		
		
		
	}
	
}
