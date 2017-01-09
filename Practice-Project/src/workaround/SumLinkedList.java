package workaround;

import hackerrank.LinkedListNode;

public class SumLinkedList {
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(3, new LinkedListNode(5, new LinkedListNode(8, new LinkedListNode(5, new LinkedListNode(10, new LinkedListNode(2, new LinkedListNode(1,null)))))));
		
		int sum = 0;
		
		LinkedListNode runner = head;
		
		// NOTE: 
		// do....while(); loop => require 'semi-colon'
		// while()... loop => doesn't require 'semi-colon'
		
		do{
			sum += runner.data;
		}while((runner = runner.next) != null);
			
		System.out.println(sum);
	}

}
