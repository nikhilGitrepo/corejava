package arraysandstrings;

public class IsUnique {

	public static void main(String[] args) {
		String test = "afbce";
		int startIndex = 0;
		while(startIndex < test.length()-1){
		for(int i = startIndex+1 ; i < test.length();i++){
			if(test.charAt(i)  == test.charAt(startIndex)){
				System.out.println("Not Unique");
				break;
			}
		}
		startIndex++;
		}
		
		IsUnique isu = new IsUnique();
		isu.efficientIsUnique(test);
		
	}
	
	public void efficientIsUnique(String sample){
		boolean[] asciichars = new boolean[128];
		for(int i=0;i<sample.length();i++){
			if(asciichars[(int) sample.charAt(i)]){
				System.out.println("Not Unique");
				return;
			}else{
				asciichars[sample.charAt(i)] = true;
			}
		}
	}
	
}
