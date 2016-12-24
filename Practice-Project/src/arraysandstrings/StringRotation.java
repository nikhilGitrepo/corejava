package arraysandstrings;
public class StringRotation {
	public static void main(String[] args) {
		
		String rotn = "waterbottle";
		String actual = "erbottlewat";
		
		String newStr = actual + actual;
		
//		if(newStr.contains(rotn)){
		if(newStr.indexOf(rotn) > 0){
			System.out.println("Yes! its a rotation");
		}else{
			System.out.println("Not a rotation");
		}
		
	}
	
}
