package arraysandstrings;

public class StringCompression {
	public static void main(String[] args) {

		String test = "aaabbbbcccccaab";
		
		StringBuffer op = new StringBuffer();
//		op.setLength(test.length()*2);
		
		int limit = test.length();
		char prev = ' ';
		int internalCount = 0;
		for(char c: test.toCharArray()){
			if(prev != ' ' && c != prev){
				op.append(prev);
				op.append(internalCount);
				internalCount = 0;
			}
			
			if(op.length() > limit){
				System.out.println(test);
				return;
			}
			
			prev = c;
			internalCount++;
		}
		op.append(prev);
		op.append(internalCount);
		
		if(op.toString().length() > test.length() ){
			System.out.println(test);
		}else{
			System.out.println(op.toString());
		}
		
	}
}
