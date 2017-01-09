package linkedlist;

import hackerrank.LinkedListNode;

public class LoopDetection {
	
	public static void main(String[] args) {
		
		/*
		 * 3 --> 5 --> 8 --> 1 --> 10 --> 2 -->8
		 */
		LinkedListNode head 
		= new LinkedListNode(3, 
				new LinkedListNode(5, 
						new LinkedListNode(8, 
								new LinkedListNode(1, 
										new LinkedListNode(10, 
												new LinkedListNode(2, 
														new LinkedListNode(8,null)))))));
		
		int[] hashTable = new int[128];
		LinkedListNode runner = head;
		while(runner!=null){
			if(hashTable[runner.data] != 0){
				System.out.println(runner.data);
				break;
			}else{
				hashTable[runner.data] = runner.data;
			}
			runner = runner.next;
		}
		
	}

}
