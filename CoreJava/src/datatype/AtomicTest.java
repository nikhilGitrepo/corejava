package datatype;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

	public static void main(String[] args) {
		AtomicInteger atInt = new AtomicInteger();
		System.out.println(atInt.intValue());
		atInt.getAndIncrement();
		System.out.println(atInt.intValue());
		
		Random r = new Random();
		while(r.nextLong() != 0 ) {
			System.out.println(r.nextLong());
		}
		
	}
	
}
