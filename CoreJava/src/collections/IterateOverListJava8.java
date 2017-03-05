package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterateOverListJava8 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
//		for(int x = 0; x < 10220; x ++) {
			names.add("a");
			names.add("a");
			names.add("b");
			names.add("c");
			names.add("d");
//		}
		
		
//		java8Iterate(names);
		
		System.out.println(names.size());
		System.out.println(Collections.binarySearch(names, "a"));
	}

	private static void java8Iterate(List<String> names) {
		Long stop = new Long(0l);
		Long start = System.currentTimeMillis();
		
		names.stream().forEach(s -> {
			
			System.out.println(s.toUpperCase());
			
		});
		
//		for(String s : names)
//			System.out.println(s.toUpperCase());
		
		stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}
	
}
