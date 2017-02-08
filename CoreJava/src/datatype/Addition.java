package datatype;

public class Addition {

	public static void main(String[] args) {
		int a =1;
		double d = 1.0;
		float f = 1.0f;
		
		double res1 = a+d;
		float res2 = a+f;
		double res3 = d+f;
		
		System.out.println("------------------------");
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		System.out.println("------------------------");
		
		System.out.println((int) -2.0f);
		System.out.println((int) -2.0d);
		System.out.println((int) -2.7f);
		
		System.out.println("------------------------");

	}
	
}
