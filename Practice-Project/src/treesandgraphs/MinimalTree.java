package treesandgraphs;

public class MinimalTree {

	public static void main(String[] args) {
//		int a[] = {1,2,3};
		int a[] = {1,2,3,4,5,6,7,8};
		
		TreeNode tn = new TreeNode();
				
		tn = createTree(a,tn);
		System.out.println(tn);
		
	}

	public static TreeNode createTree(int[] subarray, TreeNode tn) {
		
		int rootIndex = subarray.length/2;
		
		tn.data = subarray[rootIndex];
		
		if(subarray.length == 1){
			tn.left = null;
			tn.right = null;
		}else{
			int[] leftArray = createSubArray(subarray,0,rootIndex-1);
			tn.left = createTree(leftArray, new TreeNode());

			if( rootIndex+1 <= subarray.length-1){
				int[] righttArray = createSubArray(subarray,rootIndex+1,subarray.length-1);
				tn.right = createTree(righttArray, new TreeNode());
			}
		}
		return tn;
	}
	
	private static int[] createSubArray(int [] orig, int start, int end ) 
	{
	   int [] newArr = new int[ (end - start)+1 ] ;

	   for ( int i = 0 ; i < newArr.length ; i++ )
	   {
	      newArr[ i ] = orig[ start+i ] ;
	   }

	   return newArr ;
	}

	
}
