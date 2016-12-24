package arraysandstrings;

public class PalindromePermutation {
	
	public static void main(String[] args) {
		String[] input = {"tact Coa","4599954","45874"};
		for(String str: input){
		str = str.toLowerCase();
		int[] vector = new int[128]; 
		
		for(char c: str.toCharArray()){
			if(c != ' ') vector[(int) c]++;
		}
		
		boolean oddFlag = false;
		boolean allEven = true;
		for(int i: vector){
			
			if(i%2 != 0){
				if(!oddFlag){
					oddFlag = true;
				}else{
					System.out.println("Cannot be a Palindrome");
					return;
				}
			}
			
//			if(oddFlag){
//				allEven = false;
//			}
		}
		
//		if(allEven){
			System.out.println("Can be a Palindrome");	
//		}else{
//			if(oddFlag){
//				System.out.println("this way");
//				System.out.println("Cannot be a Palindrome");
//			}
//		}
		}
	}

}
