package arraysandstrings;

public class RotateMatrix {
	public static void main(String[] args) {
		
		int[][] matrix = {
		
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},
				{41,42,43,44}
				
		};
		int[][] op = new int[matrix.length][matrix[0].length];
		
		// iterate through output column from last to first
		for(int j=op.length-1;j>=0;j--){
			
			// for each column, iterate through its rows
			// last column in op will hold => 1st row of input
				int i=0;
				
				// choosing the input row index based on output column index
				int im = matrix.length-1-j;
				
				// appending the output with appropriate value
				for(int jm=0;jm<matrix[im].length;jm++){
					op[i++][j] = matrix[im][jm];
				}
		}
		
		System.out.println("---");
		for(int i=0; i < op.length; i++){
			for(int j=0;j<op[i].length;j++){
				System.out.print(op[i][j]);
				System.out.print(",");
			}
			System.out.println();
		}
		
	}
	
	public void easyRotateMarix(int[][] matrix){
		/*
		 * The algorithm may follow these steps:
		 * 1) Generating intermediate matrices
		 * 2) Reverse the rows input matrix 
		 * 3) Iterate through each row and write the output column-wise
		 * 4) 
		 */
	}
}
