package stackandqueue;

public class MyQueue<T> {

	private Stack<T> partOne;
	private Stack<T> partTwo;
	
	public MyQueue(Stack<T> partOne, Stack<T> partTwo) {
		this.partOne = partOne;
		this.partTwo = partTwo;
	}

	public MyQueue() {
		this.partOne = new Stack<T>();
		this.partTwo = new Stack<T>();
	}
	
	public void enque(T data){
		//push in partOne
	}
	
	public T deque() throws Exception{
		// 2 steps
		//1) Pop from partOne & Push into partTwo stack
		//2) Pop from partTwo for FIFO
		T dataItem = partTwo.pop();
		//3) Restore partOne : pop from partTwo => push into partOne
		return dataItem;
	}
	
	public T peek() throws Exception{
		// 2 steps
		//1) Pop from partOne & Push into partTwo stack
		//2) Pop from partTwo for FIFO
		T dataItem = partTwo.peek();
		//3) Restore partOne : pop from partTwo => push into partOne
		return dataItem;
	}
	
}
