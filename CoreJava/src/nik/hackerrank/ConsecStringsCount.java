package nik.hackerrank;

public class ConsecStringsCount {
	
	static int found = 0;
	static String ONE = "1";
	static String ZERO = "0";
	

	
	public static void main(String[] args) {
		String test = "111000";

		for (int i = 0; i < test.length(); i++) {
			int end = i + 2;
			while ((end <= test.length())) {
				System.out.println(test.substring(i, end));
				testPattern(test.substring(i, end));
				end = end + 2;
			}
		}

		System.out.println(found);
	}

	private static void testPattern(String substring) {

		String part1 = substring.substring(0, (substring.length() / 2));
		String part2 = substring.substring((substring.length() / 2), (substring.length()));

		if(part1.contains(ONE) && part1.contains(ZERO)){
			return;
		}else if(part2.contains(ONE) && part2.contains(ZERO)){
			return;
		}else if(part1.contains(ONE) && part2.contains(ZERO)){
			found++;
			return;
		}else if(part1.contains(ZERO) && part2.contains(ONE)){
			found++;
			return;
		}

	}
}
