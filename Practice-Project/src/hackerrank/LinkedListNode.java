package hackerrank;

public class LinkedListNode {
	public int data;
	public LinkedListNode next;
	public boolean isHead = false;
	
	
	public LinkedListNode(int data, LinkedListNode next) {
		this.data = data;
		this.next = next;
	}
	
	public LinkedListNode() {
	}
}
