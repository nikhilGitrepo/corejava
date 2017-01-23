package regex;

public class StringRegex2 {

	public static void main(String[] args) {
		
		String example = "abc\u6771bca";
//                + "string which I'm going to \u6771 " + "use for pattern matching.";
		
//		System.out.println(example.matches("\\w.*"));
//		String[] parts = example.split("(\\W+)");
//		System.out.println(parts.length);
//		for(String s: parts)
//			System.out.println(s);
		
		System.out.println(example.replaceAll("\\W*", ""));
	}
	
}
