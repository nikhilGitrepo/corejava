package arraysandstrings;
import java.util.Arrays;

public class ReplaceSpace {
	
	public static void main(String[] args) {
		String input = "Mr John Smith       ";
		int trueSize = 14;
		
		ReplaceSpace rs = new ReplaceSpace();
		System.out.println(rs.replace(input,trueSize)
		);
	}

	private String replace(String input, int trueSize) {
		
		char[] parts = input.toCharArray();
		
		int shifts=0;
		for(int i=trueSize-1;i>=0;i--){
			System.out.println(i+":");
			if(parts[i] != ' '){
				shifts++;
			}else if(parts[i] == ' '){
//				System.out.println(new String(parts));
				for(int j = i+shifts; j > i ;j--){
					System.out.println(j + ":" + i + ":" + shifts);
					parts[j+2] = parts[j];
				}
				parts[i] = '%';
				parts[i+1] = '2';
				parts[i+2] = '0';
				shifts +=3;
			}
		}
		return new String(parts);
	}

}
