package hackerrank;

public class RemoveDuplicatesSortedList {

	static LinkedListNode RemoveDuplicates(LinkedListNode head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		// Node n = head;

		LinkedListNode current = head;
		LinkedListNode prev = null;
		while (current != null) {
			if (prev != null && current.data == prev.data) {

				if (current.next == null) {
					prev.next = null;
				} else {
					prev.next.data = current.next.data;
					prev.next.next = current.next.next;
				}
				current = prev.next;

			} else {
				prev = current;
				current = current.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1, new LinkedListNode(2, new LinkedListNode(2, new LinkedListNode(3, new LinkedListNode(3, new LinkedListNode(4,null))))));
		
		// Node head = new Node(1, new Node(1, new Node(1, new Node(1, new Node(1,null)))));
		
		// Node head = new Node(2, new Node(3, new Node(3, new Node(4, new Node(6,null)))));
		
		// Node head = new Node(3, new Node(5, new Node(8, new Node(5, new Node(10, new Node(2, new Node(1,null))))));

		
		LinkedListNode tmp = head;
		tmp = printNdoes(tmp);
		
		tmp = RemoveDuplicatesSortedList.RemoveDuplicates(head);
		
		tmp = printNdoes(tmp);
	
	}

	/**
	 * @param head
	 * @param tmp
	 * @return
	 */
	private static LinkedListNode printNdoes( LinkedListNode tmp) {
		while(tmp!=null){
			System.out.print(tmp.data);
			tmp = tmp.next;
		}
		System.out.println();
		return tmp;
	}

}
