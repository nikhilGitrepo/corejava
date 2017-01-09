package treesandgraphs;

public class CheckBST {

	private int leftmax = 0;
	boolean pass = true;
	public static void main(String[] args) {
		
		TreeNode runner = new TreeNode();
		CheckBST check = new CheckBST();
		
		// POST-ORDER TRAVERSAL TECHNIQUE
		runner = check.createTree();
		System.out.println(check.checkBst(runner));
		
	}

	private boolean checkBst(TreeNode runner) {
	
		if(!pass){
			return false;
		}
		
		if(runner == null){
			return true;
		}

		if(runner.left != null && (runner.left.data > runner.data)){
			pass = false;
		}else if(runner.right != null && (runner.right.data <= runner.data)){
			pass = false;
		}else{
			
			pass = checkBst(runner.left);
			
			if(pass){
				if(leftmax > runner.data){
					return false;
				}
				pass = checkBst(runner.right);
				
			}else{
				return false;
			}
			
			if(runner.data > leftmax ){
				leftmax = runner.data;
			}
		}
		
		return pass;

	}

	private TreeNode createTree() {
		TreeNode tree = new TreeNode();
		
		tree.data = 4;
		tree.right = new TreeNode(5);
		tree.left = new TreeNode(2);
		tree.left.left = new TreeNode(1);
		tree.left.right = new TreeNode(3);
		
		return tree;
	}
}