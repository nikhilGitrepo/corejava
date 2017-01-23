package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class HTMLTagRegexTest {

	@Test
	public void htmlTest(){
		String tag = "<a href=\"http://www.vogella.com/training/eclipse/eclipsercp.html\" "
				+ "onclick=\"_gaq.push(['_trackEvent', 'vogella Services', 'clicked', 'next RCP training']);\">"
				+ "06 FEB - RCP Training"
				+ "</a>";
		
		String regex = "<a\\s*href=.*\"\\s*>.*</a>";
		
		assertTrue(tag.matches(regex));
		
	}
	
	@Test
	public void extractlink(){
		String tag = "<a href=\"http://www.vogella.com/training/eclipse/eclipsercp.html\" "
				+ "onclick=\"_gaq.push(['_trackEvent', 'vogella Services', 'clicked', 'next RCP training']);\">"
				+ "06 FEB - RCP Training"
				+ "</a>";
		
		String required = "http://www.vogella.com/training/eclipse/eclipsercp.html";
		
//		String regex = "(http|https){1}(://){1}.*";
		String regex = "http://([a-zA-Z./])*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(tag);
		m.find();
		System.out.println(m.group());
		
		assertEquals(m.group(),required);
		
//		System.out.println(tag.replaceAll(regex, "*"));
//		assertEquals(tag.replaceAll(regex, "_"), required);
	}
	
}
