package miscellaneous;

public class sumOfThreeNumsEq0 {
	public static void main(String[] args) {
		int series[] = {0,1,-1, -3,5,6,-2,9,-9,0,-1};
		
		for(int start = 0;start<series.length-2;start++){
			int sum = series[start]+ series[start+1];
			for(int j = start+2;j<series.length;j++){
				int sum_tmp = sum + series[j];
				if(sum_tmp ==0){
					System.out.println(series[start] + " + " + series[start+1] + " + " + series[j]);
				}
			}
		}
			
	}

}