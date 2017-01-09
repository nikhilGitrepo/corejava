package arraysandstrings;

public class Oneway {
	public static void main(String[] args) {
		String str = "ppale";
		String strr = "pppe";

		int[] strints = new int[128];
		int[] strrints = new int[128];
		int diff = str.length() - strr.length();
		if (diff == 1) {
			for (char c : str.toCharArray()) {
				strints[(int) c]++;
			}

			for (char c : strr.toCharArray()) {
				strrints[(int) c]++;
			}

			for (char c : strr.toCharArray()) {
				if ((strrints[(int) c] != strints[(int) c])
						&& (strrints[(int) c] - strints[(int) c] > 1
								|| strrints[(int) c] - strints[(int) c] < 0)
					) {
					System.out.println("Not a one way");
					return;
				}
			}

			for (char c : str.toCharArray()) {
				if ((strints[(int) c] != strrints[(int) c])
						&& (strints[(int) c] - strrints[(int) c] > 1
								|| strints[(int) c] - strrints[(int) c] < 0)
					) {
					System.out.println("Not a one way");
					return;
				}
			}

			System.out.println("Yes, it's just One way");
		}else{
			System.out.println("Not a one way");
		}
		Oneway ow = new Oneway();
		ow.checkOneway(str,strr);

	}

	private void checkOneway(String str, String strr) {
		
		/*
		 * Assumptions: both strings are in same order, not permutation
		 * Strategies:
		 * 	Replacement: pale | bale
		 *  Insertion: pale | ale
		 *  Removal: apale | pale
		 *  
		 *  implementation of Insertion == Removal
		 * 
		 */
		/*char[] parts1 = str.toCharArray();
		char[] parts2 = strr.toCharArray();
		
		for(char c: parts1){
			
		}*/
		
	}
}
