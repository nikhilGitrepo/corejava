package nik.egen;

public class Test {

	public static void main(String[] args) {
		
		try {
			Float f1= new Float("3.0");
			int i1 = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(i1+b+d);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String str[] ={"a", "b", "c"};
		System.out.println(Math.ceil(-4.1));
		
	}

}
