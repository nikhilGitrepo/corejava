package nik.egen;

public class Test2 extends Test{

	static final Integer i1 =1;
	final Integer i2 =2;
	Integer i3 =3;
	public static void main(String[] args) {
//		final Integer i4 =4;
//		Integer i5 = 5;
//		class Inner{
//			final Integer i6 = 6;
//			Integer i7 = 7;
//			Inner(){
//				System.out.println(i6+i7);
//			}
//		}
		
//		try {
//			int m = 1;
////			System.out.println(m);
//
//			System.out.println("A");
//		} catch (Exception e) {
//			System.out.println("b");
//		}finally{
//			System.out.println("C");
//		}
//		System.out.println("D");
		int m=1;
		called(m);
		System.out.println(m);
	}
	private static void called(int m) {
		// TODO Auto-generated method stub
		m =10;
//		throw new RuntimeException();
		
	}
}
