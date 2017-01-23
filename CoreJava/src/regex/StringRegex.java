package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
	
	public static void main(String[] args) {
		String regex1 = ".{3}\\..{3}\\..{3}\\..{3}";
		String regex2 = "...\\....\\....\\....";
		String test = "abc.def.ghi.jkl";
		
		/*Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2);
		Matcher m1 = p1.matcher(test);
		Matcher m2 = p2.matcher(test);
		
		System.out.println(m1.matches());
		System.out.println(m2.matches());
		
		*/
		
		System.out.println(test.matches(""));
	}

}
