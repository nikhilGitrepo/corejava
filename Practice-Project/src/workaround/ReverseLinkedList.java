package workaround;

import hackerrank.LinkedListNode;

public class ReverseLinkedList {

	static LinkedListNode runner = new LinkedListNode();
	static LinkedListNode reverse = new LinkedListNode();
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(3, new LinkedListNode(5, new LinkedListNode(8, new LinkedListNode(5, new LinkedListNode(10, new LinkedListNode(2, new LinkedListNode(1,null)))))));
		head.isHead = true;
//		LinkedListNode head = new LinkedListNode(3, new LinkedListNode(5, new LinkedListNode(2, new LinkedListNode(5, new LinkedListNode(3,null)))));
		
		runner = head;

		LinkedListUtils.printNodes(head);
		
		LinkedListNode reverseholder = reverse;
		recursiveNodes(runner);
		
		LinkedListUtils.printNodes(reverseholder);
		
	}
	
	public static LinkedListNode reverseList(LinkedListNode root){
		runner = root;

		LinkedListNode reverseholder = reverse;
		recursiveNodes(runner);
		
		return reverseholder;
	}
	
	public static void recursiveNodes(LinkedListNode node){
		if(node.next == null){
			reverse.data = node.data;
			reverse.next = new LinkedListNode(0,null);
			reverse = reverse.next;
		}else{
//			System.out.println(node.data); // Print the node in Calling Order

			recursiveNodes(node.next);
			reverse.data = node.data;	// The below code for setting next node in Reverse
			
			if(!node.isHead){
				reverse.next = new LinkedListNode();	// has to be executed in the reverse order of Call stack 
				reverse = reverse.next;		// This is because we need last data first.
			}
		}
	}
	
	private static LinkedListNode printNodes( LinkedListNode tmp) {
		while(tmp!=null){
			System.out.print(tmp.data);
			if(tmp.next != null) System.out.print("-->");
			tmp = tmp.next;
		}
		System.out.println();
		return tmp;
	}	
	
}
