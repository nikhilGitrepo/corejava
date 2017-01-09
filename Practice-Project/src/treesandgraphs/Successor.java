package treesandgraphs;

//import treesandgraphs.CheckBST;

public class Successor {

	public static void main(String[] args) {
		TreeNode runner = new TreeNode();
		Successor scr = new Successor();
		
		// POST-ORDER TRAVERSAL TECHNIQUE
		runner = scr.createTree();
		
		scr.findNext(runner.left);
		
	}
	
	boolean found = false;
	/**
	 * Using In-Order Traversal
	 * @param node
	 * @return
	 */
	private TreeNode findNext(TreeNode node) {
		TreeNode nextNode = new TreeNode();
		if(node.right != null){
			nextNode = leftMostNode(node.right);
		}else{
			TreeNode currNode = node;
			TreeNode parent = node.parent;
			while(parent.left!= null && parent.left != currNode){
				currNode = parent;
				parent = currNode.parent;
			}
			return parent;
		}
		return nextNode;
		
	}

	private TreeNode leftMostNode(TreeNode right) {
		TreeNode runnr = right;
		while(runnr.left != null){
			runnr = runnr.left;
		}
		
		return runnr;
	}

	TreeNode somenode = new TreeNode();
	
	private TreeNode createTree() {
		TreeNode tree = new TreeNode();
		
		tree.parent = null;
		tree.data = 4;

		tree.right = new TreeNode(6);
		tree.right.parent = tree;
		
		tree.right.left = new TreeNode(5);
		tree.right.left.parent = tree.right;
		
		tree.left = new TreeNode(2);
		tree.left.parent = tree;
		
		
		tree.left.left = new TreeNode(1);
		tree.left.left.parent = tree.left;
		
		tree.left.right = new TreeNode(3);
		tree.left.right.parent = tree.left;
		
		return tree;
	}
	
}
