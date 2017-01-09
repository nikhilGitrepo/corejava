package linkedlist;

import hackerrank.LinkedListNode;
import workaround.LinkedListUtils;
import workaround.ReverseLinkedList;

public class Palindrome {
	
	static LinkedListNode runner = new LinkedListNode();
	static LinkedListNode reverse = new LinkedListNode();
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(3, new LinkedListNode(5, new LinkedListNode(2, new LinkedListNode(2, new LinkedListNode(5, new LinkedListNode(3,null))))));
		head.isHead = true;

		runner = head;
		CheckPalindrome(runner);
	}

	private static void CheckPalindrome(LinkedListNode head) {

		LinkedListNode runner = head;
		System.out.print("List:\t\t");	LinkedListUtils.printNodes(head);
		
		LinkedListNode reverseholder = reverse;
		reverseholder = ReverseLinkedList.reverseList(runner);
		
		
		System.out.print("It's Reverse:\t");	LinkedListUtils.printNodes(reverseholder);
		
		while(runner != null && reverseholder != null){
			if(runner.data != reverseholder.data){
				System.out.println("Not a Palindrome List");
				return;
			}
			runner = runner.next;
			reverseholder = reverseholder.next;
		}
		System.out.println("Yes, the List is a Palindrome");
	}
	
}
