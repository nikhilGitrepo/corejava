package stackandqueue;

public class Stack<T> {

	private StackNode<T> top;
	
	public T pop() throws Exception{
		if(top == null){
			throw new Exception();
		}
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item){
		StackNode<T> t = new StackNode<>();
		t.data = item;
		t.next = top;
		top = t;
	}
	
	public T peek() throws Exception{
		
		if(top == null){
			throw new Exception();
		}
		return top.data;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
}
