package datastructures;

public class LCALeastCommonAncester {

	public static void main(String[] args) {
		
		Node root = new BinaryTree().createTree();
		System.out.println(getLCA(root, new Node(4), new Node(3)).getKey());
//		int num1 = 
//		int[] 
	}
	
	public static Node getLCA(Node root, Node A, Node B) {
		if(root == null) {
			return null;
		}
		
		if(root.getKey() == A.getKey() || root.getKey() == B.getKey()) {
			return root;
		}
		
		Node left = getLCA(root.getLeft(), A, B);
		Node right = getLCA(root.getRight(), A, B);
		
		if(left != null && right != null) {
			return root;
		}
		
		if(left == null) {
			return right; 
		}else {
			return left; 
		}
		
	}
	
}
