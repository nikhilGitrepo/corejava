package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class LinkGetter {

	Pattern htmlTag = Pattern.compile("<a\\s*href=.*\"\\s*>.*</a>");
	Pattern link = Pattern.compile("http://([a-zA-Z./])*");

	List<String> links = new ArrayList<>();
	
	@Test
	public void linkChecker(){
		getAllLinksFromUrl("http://www.vogella.com/tutorials/JavaRegularExpressions/article.html#what-are-regular-expressions");
		System.out.println(links);
	}

	private List<String> getAllLinksFromUrl(String url) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()) );
			String s = "";
			while((s = br.readLine()) != null){
				Matcher tagMatcher = htmlTag.matcher(s);
				if(tagMatcher.find()){
					Matcher linkMatcher = link.matcher(tagMatcher.group());
					if(linkMatcher.find()){
						links.add(linkMatcher.group());
					}
//					isValidLink(linkMatcher);
				}
				
				
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
