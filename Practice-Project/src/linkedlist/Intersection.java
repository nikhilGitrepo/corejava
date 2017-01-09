package linkedlist;

import hackerrank.LinkedListNode;
import workaround.LinkedListUtils;
import workaround.ReverseLinkedList;

public class Intersection {
	
	public static void main(String[] args) {
		
		LinkedListNode common = new LinkedListNode(7, new LinkedListNode(2, new LinkedListNode(1, null)));
		
		LinkedListNode list1 = new LinkedListNode(3, new LinkedListNode(1, new LinkedListNode(5, new LinkedListNode(9, null))));
		
		LinkedListNode list2 = new LinkedListNode(4, new LinkedListNode(6, null));
		
		LinkedListNode list1Runner = list1;
		LinkedListNode list2Runner = list2;
		
		while(list1Runner.next != null){
			list1Runner = list1Runner.next;
		}
		
		list1Runner.next = common;
		
		while(list2Runner.next != null){
			list2Runner = list2Runner.next;
		}
		list2Runner.next = common;
		list1Runner = list1;
		list2Runner = list2;

		LinkedListUtils.printNodes(list1Runner);
		LinkedListUtils.printNodes(list2Runner);
		
		// manipulating data in common list will lead to a change both the lists
//		common.data = 10;
		
		System.out.print("Node of intersection is: ");
		findIntersection(list1Runner,list2Runner);
		
	}

	private static void findIntersection(LinkedListNode list1Runner, LinkedListNode list2Runner) {

		LinkedListNode l1r = list1Runner;
		LinkedListNode l2r = list2Runner;
		
		l1r = ReverseLinkedList.reverseList(l1r);
		l2r = ReverseLinkedList.reverseList(l2r);
		
		LinkedListNode prev = new LinkedListNode();
		LinkedListNode intersection = new LinkedListNode();
		
		while(l1r.next != null && l2r.next != null){
			if(l1r.data != l2r.data){
				intersection = prev;
				break;
			}
			prev = l1r;
			l1r = l1r.next;
			l2r = l2r.next;
		}
		
		System.out.print(intersection.data);
		
	}

}
