package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import regex.RegexAllPattern;

public class RegexUnitTest {

	RegexAllPattern rap;

	String str1 = "true";
	String str2 = "TrueYes";
	String str3 = "I am a true Indian";
	String str4 = "True Indian is me";
	String str5 = "India is the country that is true";
	String str6 = "abc";
	String str7 = "4.0abc";
	String str8 = "a4.0bc 6dsd";
	String str9 = "a4.0ssd 6dsd";
	String strb = "bbb";
	
	String str10 = "nfkfdnfn773mldm 505mls scsd434mm%$..wewe";
	String str11 = "nfkfdnfn33mldm 55mls scsd4mm%$5..wewe";
	
	@Before
	public void setup() {
		rap = new RegexAllPattern();
	}
	
	@Test
	public void testTrue(){
		assertFalse(rap.testTrue(str1));
	}

	@Test
	public void testNumlessThan300() {
		assertFalse(rap.testNumlessThan300(str10));
		assertFalse(rap.testNumlessThan300(str11));
	}

	@Test
	public void testArbitraryNumOfCharsexcept3() {
		assertTrue(rap.testArbitraryNumOfCharsexcept3(str9));
		assertFalse(rap.testArbitraryNumOfCharsexcept3(str8));
		assertTrue(rap.testArbitraryNumOfCharsexcept3(str1));
		assertFalse(rap.testArbitraryNumOfCharsexcept3(strb));
	}

	@Test
	public void testNoNumAtBeginningwithd() {
		assertTrue(rap.testNoNumAtBeginningwithd(str8));
	}

	@Test
	public void testNumAtBeginning() {
		assertTrue(rap.testNumAtBeginning(str7));
		assertTrue(rap.testNumAtBeginningwithd(str7));
	}

	@Test
	public void test3Letters() {
		assertTrue(rap.test3Letters(str6));
		assertFalse(rap.test3Letters(str1));
	}

	@Test
	public void testTrueInSentence() {
		assertTrue(rap.testTrueInSentence(str3));
		assertTrue(rap.testTrueInSentence(str4));
		assertTrue(rap.testTrueInSentence(str5));
	}

	@Test
	public void testTrueYes() {
		assertTrue(rap.testTrueYes_tTyY(str2));
	}

	@Test
	public void testTruetT() {
		assertTrue(rap.testTrue_tT(str1));
	}
	
}
