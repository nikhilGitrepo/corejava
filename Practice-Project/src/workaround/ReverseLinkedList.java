package workaround;

import hackerrank.LinkedListNode;

public class ReverseLinkedList {

	static LinkedListNode runner = new LinkedListNode();
	static LinkedListNode reverse = new LinkedListNode();
	
	public static void main(String[] args) {
		
		LinkedListNode head = new LinkedListNode(3, new LinkedListNode(5, new LinkedListNode(8, new LinkedListNode(5, new LinkedListNode(10, new LinkedListNode(2, new LinkedListNode(1,null)))))));
		
		runner = head;

		printNodes(head);
		
		LinkedListNode reverseholder = reverse;
		recursiveNodes(runner);
		
		printNodes(reverseholder);
		
	}
	
	private static void recursiveNodes(LinkedListNode node){
		if(node.next == null){
			reverse.data = node.data;
			reverse.next = new LinkedListNode();
			reverse = reverse.next;
		}else{
			System.out.println(node.data); // Print the node in Calling Order

			recursiveNodes(node.next);
			reverse.data = node.data;	// The below code for setting next node in Reverse
			reverse.next = new LinkedListNode();	// has to be executed in the reverse order of Call stack 
			reverse = reverse.next;		// This is because we need last data first.
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
