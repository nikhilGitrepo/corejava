package datastructures;

public class MinDepth {

	public static void main(String[] args) {
		
		Node root = new BinaryTree().createTree();
		System.out.println(minDepth(root));
	}

	private static int minDepth(Node root) {
		if(root == null) {
			return 0;
		}
		
		int left = minDepth(root.getLeft());
		int right = minDepth(root.getRight());
		
		return 1 + Math.min(left, right);
		
	}
	
}
