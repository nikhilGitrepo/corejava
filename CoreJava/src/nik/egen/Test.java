package nik.egen;

public class Test {

	public static void main(String[] args) {

		try {
			Float f1= new Float("3.0");
			int i1 = f1.intValue();
			System.out.println("f1.intValue() : "+i1);
			byte b = f1.byteValue();
			System.out.println("f1.byteValue() : "+b);
			double d = f1.doubleValue();
			System.out.println("f1.doubleValue() : "+d);
			System.out.println(i1+b+d);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Math.floor(-4.1));
		
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
	}

}
