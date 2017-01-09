package multithreading;

public class DirectlyCallingRunMethod {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		
		t1.run();
		t2.run();
		
//		t2.start();
//		t1.start();
		
/*		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
	}
	
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Running the thread: " + Thread.currentThread().getName());
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("From thread: " + Thread.currentThread().getName() + " - " +i );
		}
	}
}
