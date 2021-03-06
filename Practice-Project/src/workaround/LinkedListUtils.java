package workaround;

import hackerrank.LinkedListNode;

public class LinkedListUtils {

	public static LinkedListNode printNodes( LinkedListNode runner) {
		
		LinkedListNode tmp = runner;
		while(tmp!=null){
			System.out.print(tmp.data);
			if(tmp.next != null) System.out.print("-->");
			tmp = tmp.next;
		}
		System.out.println();
		return tmp;
	}	
	
}
