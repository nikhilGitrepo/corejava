package arraysandstrings;

public class IsPermutation {
  public static void main(String[] args) {
  String test = "0d";
  String test2 = "0dg";
  
  IsPermutation isp = new IsPermutation();
  isp.checkPermutation(test,test2);
  
  }

	private void checkPermutation(String test, String test2) {
		if(test.length() != test2.length()){
			System.out.println("Not Permutation");
			return;
		}
		
		int[] countAscii = new int[128];
		
		for(int i= 0; i<test.length(); i++){
			countAscii[(int)test.charAt(i)]++;		
		}

		for(int i = 0; i< test2.length(); i++){
			countAscii[test2.charAt(i)]--;
			if( countAscii[test2.charAt(i)] < 0 ){
				System.out.println("Not Permutation");
				return;
			}
		}
		System.out.println("Yes, it's a Permutation");

	}
	
	private void isReverse(String test, String test2){

//  int i = test2.length()-1;
//  for(char s: test.toLowerCase().toCharArray()){
////	  System.out.println(s + " : " + test2.toLowerCase().charAt(i) );
//   if(test2.toLowerCase().charAt(i) != s){
//    System.out.println("Not a Permutation");
//    return;
//   }
//   i--; 
//  }
//  System.out.println("Yes, It's a Permutation");
	
	}
  
  
}
