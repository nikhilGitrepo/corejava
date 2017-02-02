package regex;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class FindIf999 {

	@Test
	public void testif99(){
		int[] num = {9,9,9};
		String numStr = Arrays.toString(num);
		System.out.println(numStr);
		
		assertTrue(numStr.matches("\\[[,\\s]*\\]"));
		
	}
	
}
