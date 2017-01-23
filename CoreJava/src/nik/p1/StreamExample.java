package nik.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		
		System.out.println("---------Evaluating Sequential Stream----------");
		Stream stream1 =  ints.stream();
		
		stream1.forEach(e -> System.out.println(e));
//		stream1.forEach(ee -> System.out.println(ee)); // throws Illegal state exception
		
		System.out.println("---------Evaluating Parallel Stream----------");
		
		Stream stream2 =  ints.parallelStream();
		stream2.forEach( e -> System.out.println(e));
		stream2.forEach( e -> System.out.println(e));
		
	}
	
}
