package miscellaneous;

public class NewClass extends NewInnerClass{
	public static void main(String[] args) {
		NewClass nc = new NewClass();
		
		// Cannot reference non-static method from static method
		mainn();
		nc.method1();
	}
	
	//static methods cannot be Overridden with @Override annotation
//	@Override
//	public void mainn() {
	
	// To Override static methods, complete method signature should be followed
	
	/*
	 * Method Hiding: applicable to STATIC methods
	 *  If this method is commentted, then mainn() in New Inner Class is called
	 */
	public static void mainn() {	
		System.out.println("New Class: static method mainn()");
		
		//Cannot use Super in STATIC method
//		super.mainn();
		
		
		
	}
	
	@Override
	public void method1() {
		System.out.println("New Class : instance method1: overridden");
		super.method1();
	}
}

class NewInnerClass {
	public static void mainn() {
		System.out.println("New Inner Class: static method mainn()");
	}
	
	public void method1(){
		System.out.println("New Inner Class : instance method1");
	}
}
