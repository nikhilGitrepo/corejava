package miscellaneous;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListManipulation {
	
	static public void exec(){
		System.out.println("static");
	}
	static public void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("SE");
		list.add("EE");
		list.add("ME");
		list.add("SE");
		list.add("EE");
		
		System.out.println("-------------------");
		
		// clear: removes all array elements
		// removeAll: removes all the elements from another list
		list.clear();
//		list.removeAll(list2);

		list.add("A");
		list.add("C");
		list.add("B");
		list.add("E");
		list.add("D");

		// Sort with natural ordering, if null is passed as comparator
		// Else pass a comparator
		list.sort(null);
		
		// Sort with natural ordering, if null is passed as comparator

		Collections.sort(list);
		
		// Else pass a comparator
		Collections.sort(list, null);
		
//		list.remove("SE");
		System.out.println(list);
		
		System.out.println("-------------------");
		
		Map<String, String> map = new HashMap<>();
		map.put("SE", "SE");
		map.put("EE", "EE");
		map.put("ME", "ME");
//		map.put("SE", "SE");
//		map.put("EE", "EE");
		
//		System.out.println(map.keySet());
//		System.out.println(map.get("SE").hashCode()%16+ ","+ map.get("EE").hashCode()%16+ ","+ map.get("ME").hashCode()%16  );
	}

}
