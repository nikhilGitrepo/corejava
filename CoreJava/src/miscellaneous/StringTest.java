package miscellaneous;

public class StringTest {

	public static void main(String[] args) {
		String test = "test";
		String test2 = "test";

		System.out.println(test.intern() == test2.intern());
		System.out.println("test New".intern());
		test2 = test2.toUpperCase();
		
		System.out.println(test);
		System.out.println(test2);
	}
	
}
