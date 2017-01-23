package nik.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> myMap = new HashMap<>();
		myMap.put("1","1");
		myMap.put("a","a");
		myMap.put("2","2");
		myMap.put("c","b");
		myMap.put("b","c");
		
		for(Entry<String,String> e : myMap.entrySet()){
			System.out.println(e.getKey());
		}
		System.out.println("------------------");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("b");
		
		list.stream().forEach(e -> System.out.println(e));
		
		
	}
}
