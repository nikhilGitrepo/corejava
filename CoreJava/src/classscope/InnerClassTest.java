package classscope;

class NestedClassTest {

/*	public static void run() {
		System.out.println("run NestedClassTest");

	}*/
	
	static int number = 1;
	
	static {
		System.out.println("run NestedClassTest");
	}
	
	static class nestedClass{

		/*private static void runn() {
			System.out.println("run NestedClass");
		}*/
		
		static {
			System.out.println("run NestedClassTest");
		}
	
	}
	
	/*public static void main(String[] args) {
		
	}*/
	
}
