package miscellaneous;

public class LoopTest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length-1;i++){
			System.out.println("i : " + i + " [i+1] : " + (i+1));
			if(i < arr.length-1 & (arr[i] == arr[i+1]) ){
				System.out.println("if : " + i);
			}else{
				System.out.println("else : " + i);
			}
		}
	}	
}
