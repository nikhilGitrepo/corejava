package exceptionhandling;
import java.util.List;

public class LearningException {

	static float x;
	static List<String> list;
	static String str;
	static char c;
	static double d;
	static boolean flag;
	
	
	public static void main(String[] args) {
	
		System.out.println("default boolean= "+flag);
		
		// Primitive Default Initialized
		System.out.println(x);
		
		// NULL initialized
		System.out.println(list);

		// NULL initialized
		System.out.println(str);
		
		// Empty char, NOT NULL
		System.out.println("default char = " + c);
		
		System.out.println("default double = "+d);

		
		// Runtime: NegativeArraySizeException
		// No Compile time error
//		int[] intarr = new int[-1];
		
		try {
			// Checked Exception: ClassNotFoundException
//			Object obj = Class.forName("MyClass");
		}finally{
			
		}
		
		// Will compile: But treated as Integer
		long l = 10;
		
		float f = 12.43f;
		double d = 12.34f;
		
		// Fractional part truncated
		int i_f = (int) f;
		System.out.println(i_f);
		
		short s_num = -129;
		byte b_num = (byte) s_num;
		System.out.println(b_num);
		
		char a = 'a';
		int a_num = a;
		System.out.println(a_num);
		
	}
	
}
