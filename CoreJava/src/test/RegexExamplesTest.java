package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexExamplesTest {

/*	@Test
	public void JimOrJoe(){
		String pattern=".*(Jim|Joe).*";
		String[] names = {"sddsJimJoefsJimdfnn","sddsJifsdfnn","sddsJoeJimfsdfnn","sddsJoefsdfnn","sddsJimfsdJoefnn","Jim"};
		assertTrue(names[0].matches(pattern));
		assertFalse(names[1].matches(pattern));
		assertTrue(names[2].matches(pattern));
		assertTrue(names[3].matches(pattern));
		assertTrue(names[4].matches(pattern));
		assertTrue(names[5].matches(pattern));
	}
	
	@Test
	public void JimJoePatternMatcher(){
		String regex=".*(Jim|Joe).*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("sddsJimJoefsJimdfnn");
		assertTrue(matcher.find());
				while(matcher.find()){
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println(matcher.group());
		}
	}
	
	@Test
	public void validatePhoneNumber(){
		String regex = "\\d{3}(\\s)?(-)?\\d{4}";
		String num1 = "12345";
		String num2 = "1234-322";
		String num3 = "123-1234";
		String num4 = "12-12-3-4";
		String num5 = "123 2345";
		String num6 = "1234567";
		
		assertFalse(num1.matches(regex));
		assertFalse(num2.matches(regex));
		assertTrue(num3.matches(regex));
		assertFalse(num4.matches(regex));
		assertTrue(num5.matches(regex));
		assertTrue(num6.matches(regex));
	}*/
	
	@Test
	public void checkNumberWith3Digits(){
        String s= "1233";
        assertTrue(test(s));
        s= "0";
        assertFalse(test(s));
        s = "29 Kasdkf 2300 Kdsdf";
        assertTrue(test(s));
        s = "99900234";
        assertTrue(test(s));
	}
	
	private boolean test(String s) {
		Pattern pattern = Pattern.compile("\\d{3}");
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}
	
}
