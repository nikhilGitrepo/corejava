package regex;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class DuplicateWords {

	public static void main(String[] args) {

		String text = "This is the text to be searched " + "for occurrences of the http:// pattern.";

		String patternString = "This is the";

		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);

		System.out.println("lookingAt = " + matcher.lookingAt());
		System.out.println("matches   = " + matcher.matches());
	}

/*	@Test
	public void testDuplicateWords() {
		String regex = "\\b(\\w+)\\s*\\1\\b";
		String testString = "Hello ji Hello";
		String testString2 = "Hello ji wah Hello bhai";
		String testString3 = "loves Nikhil doing wrong Why things! Why";
		
		 * assertTrue(testString.matches(regex));
		 * assertTrue(testString2.matches(regex));
		 * assertTrue(testString3.matches(regex));
		 

		Pattern patt = Pattern.compile(regex);
		Matcher matcher = patt.matcher(testString2);

		// matcher.matches();
		// System.out.println(matcher.regionStart() + ":" +
		// matcher.regionEnd());
		// System.out.println(matcher.start() + ":" + matcher.end());
		//
		// matcher = patt.matcher(testString2);

		List<String> list = new ArrayList<String>();

		while (matcher.find()) {
			list.add(matcher.group());
			System.out.println("--match found--");
			// System.out.println("testString.length() = " +
			// testString2.length());
			// System.out.println(matcher.toMatchResult());
			// System.out.println(matcher.regionStart() + ":" +
			// matcher.regionEnd());
			// System.out.println(matcher.start() + ":" + matcher.end());
		}
		System.out.println(list);
	}*/

}
