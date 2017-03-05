package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ChainedHashMap {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(1, "11");
		System.out.println(map.size());
		
		Map<EmployeeTest, String> empmap = new HashMap<>();
		EmployeeTest e1 = new EmployeeTest(1);
		EmployeeTest e2 = new EmployeeTest(2);
		EmployeeTest e12 = new EmployeeTest(1);
		
		empmap.put(e1, "1");
		empmap.put(e2, "2");
		empmap.put(e12, "12");
		
		System.out.println(empmap.size());
		// If EmployeeTest doesn't implement hashCode, equals method 
		// then empmap.size = 3
		
		Map<Character, Character> skipListMap = new ConcurrentSkipListMap();
		skipListMap.put('a', 'a');
		skipListMap.put('b', 'b');
		skipListMap.put('c', 'c');
		
//		System.out.println(skipListMap);
		
	}

}

class EmployeeTest {

	public int id;

	public EmployeeTest(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTest other = (EmployeeTest) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
