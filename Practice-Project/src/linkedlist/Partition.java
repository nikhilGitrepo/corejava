package linkedlist;

import hackerrank.LinkedListNode;
import workaround.LinkedListUtils;

public class Partition {

	public static void main(String[] args) {

		LinkedListNode head = new LinkedListNode(3, new LinkedListNode(5, new LinkedListNode(8, new LinkedListNode(5, new LinkedListNode(10, new LinkedListNode(2, new LinkedListNode(1,null)))))));
		int value = 5;
		LinkedListNode tmp = head;
		tmp = LinkedListUtils.printNodes(tmp);
		
		//tmp = Partition.partition(head,value);
		tmp = Partition.partitionEfficient(head,value);
		tmp = LinkedListUtils.printNodes(tmp);
	
	}

	// OUTPUT doesn't match
	// But does the job of partitioning
	private static LinkedListNode partition(LinkedListNode node, int value) {
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while( node != null){
			LinkedListNode next = node.next;
			if(node.data<value){
				node.next = head;
				head = node;
			}else{
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
		
	}
	
	private static LinkedListNode partitionEfficient(LinkedListNode node, int value){
		
		// tracker is holding reference to head/node
		// If head is deleted, tracker will point to nothing or 
		// the next reference that is assigned to node
 		LinkedListNode tracker = new LinkedListNode();
 		LinkedListNode tt = tracker;
 		int currPos = 0;
		while(node != null){
			if(node.data < value){

				int tmp = node.data;
				if(currPos != 0){
				// Delete the node
				node.data = node.next.data;
				node.next = node.next.next;
				
				// Add the deleted node at next node position of head
				tracker.data = tmp;
				tracker.next = new LinkedListNode();
				
				tracker = tracker.next;
				}else{
					// Add the deleted node at next node position of head
					tracker.data = tmp;
					tracker.next = new LinkedListNode();
					
					tracker = tracker.next;
				}
			}
			currPos++;
			node = node.next;
		}
		
		return tt;
	}

	/**
	 * @param head
	 * @param tmp
	 * @return
	 */
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
