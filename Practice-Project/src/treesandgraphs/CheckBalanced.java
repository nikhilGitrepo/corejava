package treesandgraphs;

public class CheckBalanced {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,9,9};
		
		TreeNode root = new TreeNode();
		root = MinimalTree.createTree(a,root);
		
		TreeNode runner = new TreeNode();
		runner = root;
		
		CheckBalanced cb = new CheckBalanced();
		
		System.out.println("Yes, Balanced tree with total number of nodes: " + cb.postOrderCount(runner));
	}

	private int postOrderCount(TreeNode root) {

		int childCnt = 0;
		
		if(root == null){
			return childCnt;
		}
		
		int leftCnt = 0;
		int rightCnt = 0;
		
		if(root.left == null && root.right == null){
			return 1;
		}
		
		if(root != null){
			leftCnt = postOrderCount(root.left);
			rightCnt = postOrderCount(root.right);
		}
		
		if(leftCnt != rightCnt){
			if( (leftCnt - rightCnt) > 1 || (leftCnt - rightCnt) < -1){
				System.out.println("Unbalanced Tree");
				System.exit(0);
			}
		}
		
		return leftCnt + rightCnt + 1;
	}
	
	
	
	
//	public static void main(String[] args) {
//		Map<Integer,LinkedList<TreeNode>> listwithdepths = new HashMap<>();
//		
//		ListOfDepths lod = new ListOfDepths();
//		int a[] = {1,2,3,4,5,6,7};
//		listwithdepths = lod.treeToDepthsMap(a);
//		
//		System.out.println(listwithdepths);
//		LinkedList<TreeNode> baseoftree = listwithdepths.get(listwithdepths.size()-1);
//		
//		int numOfNodes = baseoftree.size();
//		
//		if(numOfNodes == Math.pow(2, listwithdepths.size()-1)){
//			System.out.println();
//		}
//	}
	
}
