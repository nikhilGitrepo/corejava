package nik.p1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		int c = 2;
		System.out.println(a.equals(b));
		b = a;
		c = b;
		
		System.out.println(a.equals(b));
//		System.out.println(b == c);
//		System.out.println(a.equals(c));
		System.out.println("-----------");
		String a_str ="a";
		String b_str ="a";
		String c_str ="c";
		System.out.println(a_str.equals(b_str));
		a_str = b_str;
		c_str = b_str;
		
		System.out.println(a_str.equals(b_str));
//		System.out.println(b_str == c_str);
//		System.out.println(a_str.equals(c_str));
		
		System.out.println("-----------");
		
		Character[] x = {'a','b','c'};
		Character y[] = {'a','b','c'};
		
		System.out.println(x.equals(y)); //false
		
		x = y;
		System.out.println(x.equals(y)); //true
		
		System.out.println("-----------");
		char xx[] = {'x'};
		char yy[] = {'x'};
		
		System.out.println(xx.hashCode()); 
		System.out.println(yy.hashCode()); // both hashcodes are different because both are different objects
		
		Object xxx = Array.newInstance(Character.TYPE, 4);
		System.out.println(xxx);
		
		System.out.println("==============");
		Arrays.stream((int[]) Array.newInstance(Integer.TYPE, 4)).forEach( e -> System.out.print(e));
//		Arrays.stream((int[]) Array.newInstance(Integer.TYPE, 4)).forEach( e::System.out.println());
		System.out.println();
		System.out.println("==============");
		
		String yyy = xx.toString();
		System.out.println(yyy);
		
		System.out.println(xx == yy); //false
		System.out.println(xx.equals(yy));
	}
	
}
