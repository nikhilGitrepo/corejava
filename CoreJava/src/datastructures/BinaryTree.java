package datastructures;

public class BinaryTree {

	 private static Node root;

	    public BinaryTree(int data)
	    {
	        root = new Node(data);
	    }
	    
	    public BinaryTree() {
		}

		public void add(Node parent, Node child, String orientation)
	    {
	        if (orientation.equals("left"))
	        {
	           parent.setLeft(child);
	        }
	        else
	        {
	            parent.setRight(child);
	        }
	    }

	    public Node createTree()
	    {
	        Node n2 = new Node(2);
	        Node n3 = new Node(3);
	        Node n4 = new Node(4);
	        Node n5 = new Node(5);
	        
	        Node n6 = new Node(6);
	        Node n7 = new Node(7);

	        BinaryTree tree = new BinaryTree(1); //  1
	        tree.add(root, n2, "left"); //          / \
	        tree.add(root, n3, "right"); //        2   3
	        tree.add(n2, n4, "left"); //          / \   \
	        tree.add(n2, n5, "right"); //        4   5   6
//	        tree.add(n3, n6, "right"); //				  \
//	        tree.add(n6, n7, "right"); //				   7
	        
	        return root;
	    }
	    
	}
class Node {
    private int key;
    private Node left;
    private Node right;

    Node (int key) {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right ) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

}
