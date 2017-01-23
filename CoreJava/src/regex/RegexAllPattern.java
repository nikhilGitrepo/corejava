package regex;

public class RegexAllPattern {
	
/*	public void main(String[] args) {
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
		
		System.out.println("testTrue: "+ testTrue(str1));
		
		System.out.println("testTrue_tT: "+ testTrue_tT(str1));
		
		System.out.println("testTrueYes_tTyY: "+ testTrueYes_tTyY(str2));
		
		System.out.println("testTrueInSentence: "+ testTrueInSentence(str3));
		System.out.println("testTrueInSentence: "+ testTrueInSentence(str4));
		System.out.println("testTrueInSentence: "+ testTrueInSentence(str5));
		
		System.out.println("test3Letters: "+ test3Letters(str6));
		System.out.println("test3Letters: "+ test3Letters(str1));
		
		System.out.println("testNumAtBeginning: "+ testNumAtBeginning(str7));
		System.out.println("testNumAtBeginningwithd: "+ testNumAtBeginningwithd(str7));
		
		System.out.println("testNoNumAtBeginningwithd: "+ testNoNumAtBeginningwithd(str8));
		
		System.out.println("testArbitraryNumOfCharsexcept3: "+ testArbitraryNumOfCharsexcept3(str9));
		System.out.println("testArbitraryNumOfCharsexcept3: "+ testArbitraryNumOfCharsexcept3(str8));
		System.out.println("testArbitraryNumOfCharsexcept3: "+ testArbitraryNumOfCharsexcept3(str1));
		System.out.println("testArbitraryNumOfCharsexcept3: "+ testArbitraryNumOfCharsexcept3(strb));
		
		System.out.println("testNumlessThan300: "+ testNumlessThan300(str10));
		System.out.println("testNumlessThan300: "+ testNumlessThan300(str11));
	}*/

	public boolean testNumlessThan300(String str) {
//		String strs= str.replaceAll("\\d*", "");
//		System.out.println(strs);
		return str.matches("[a-zA-Z]");
	}
	
	public boolean testArbitraryNumOfCharsexcept3(String str) {
		return str.matches("[^b]*");
	}

	public boolean testNoNumAtBeginningwithd(String str) {
		return str.matches("[\\D].*");
	}
	
	public boolean testNumAtBeginningwithd(String str) {
		return str.matches("\\d.*");
	}
	
	public boolean testNumAtBeginning(String str) {
		return str.matches("[0-9].*");
	}

	public boolean test3Letters(String str) {
		return str.matches("[a-zA-Z]{3}");
	}
	
	public boolean testTrueInSentence(String str) {
		return str.matches(".*[tT]rue.*");
	}

	public boolean testTrue(String str) {
		return str.matches("True");
	}
	
	public boolean testTrue_tT(String str) {
		return str.matches("[tT]rue");
	}
	
	public boolean testTrueYes_tTyY(String str) {
		return str.matches("[tT]rue[yY]es");
	}
	
}
