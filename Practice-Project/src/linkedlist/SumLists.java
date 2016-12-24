package linkedlist;

import hackerrank.LinkedListNode;

public class SumLists {

	public static void main(String[] args) {
		LinkedListNode num1 = new LinkedListNode(7, new LinkedListNode(1, new LinkedListNode(6, null)));
		//LinkedListNode num2 = new LinkedListNode(5, new LinkedListNode(9, new LinkedListNode(2, null)));
		LinkedListNode num2 = new LinkedListNode(9, new LinkedListNode(2, null));
		
		
		printNodes(num1);
		printNodes(num2);
		
		LinkedListNode output = new LinkedListNode();
		LinkedListNode outputRunner = output;
		int carry = 0;
		while(num1 != null && num2 != null){
			
//			LinkedListNode op = new LinkedListNode();
			
			int res = 0;
			
			if(carry != 0 ){
				res = num1.data+num2.data + carry;
				carry = 0;
			}else{
				res = num1.data+num2.data;
			}
			
			if(res > 9){
				carry = res/10;
			}
			
			outputRunner.data = res%10;

			num1 = num1.next;
			num2 = num2.next;
			
			if(num1 != null && num2 != null){
				outputRunner.next = new LinkedListNode();
				outputRunner = outputRunner.next;
			}else if(num1 != null && num2 == null){
				num2 = new LinkedListNode(0, null);

				outputRunner.next = new LinkedListNode();
				outputRunner = outputRunner.next;
			}else if(num1 == null && num2 != null){
				num1 = new LinkedListNode(0, null);

				outputRunner.next = new LinkedListNode();
				outputRunner = outputRunner.next;
			}
			
		}
		
		printNodes(output);
		
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
