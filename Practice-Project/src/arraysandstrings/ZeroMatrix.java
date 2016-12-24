package arraysandstrings;

/**
 * 
 * Best Solution against 6th Edition CTCI
 * --OR--
 * Better than the solution from CTCI
 * 
 * @author ulti
 *
 */
public class ZeroMatrix {
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3,4},{1,2,4,0},{1,0,7,3},{8,6,1,2}};
		printMatrix(matrix);
		
		int[] skipColumns = new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			boolean zero = false;
			int column = 0;
			for(int j=0;(j< (matrix[i].length) && (skipColumns[j] != 1)); j++){
				if( matrix[i][j] == 0){
					zero = true;
					column = j;
					matrix[i] = new int[matrix[i].length];
					skipColumns[j] = 1;
					break;
				}
			}
			if(zero){
				zero = false;
				matrix[i] = new int[matrix[i].length];
				for(int row=0;row<matrix.length;row++){
					matrix[row][column] = 0;
				}
			}
		}
		
		printMatrix(matrix);
		

	}

	/**
	 * @param matrix
	 */
	private static void printMatrix(int[][] matrix) {
		System.out.println("---------------");
		for(int i =0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
}
