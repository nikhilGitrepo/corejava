package multithreading;

public class DaemonThread {

	public static void main(String[] args) throws IllegalThreadStateException {
		UserThread t0 = new UserThread();
		UserThread t1 = new UserThread();
		t0.start();
		try {
			t0.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Thread.currentThread().setDaemon(true);
	}
}

class UserThread extends Thread{
	
	@Override
	public void run() {
		Thread current = Thread.currentThread();
//		System.out.println("Running [" + current.getName() +"]");
		System.out.println(current.getName() 
				+ " : isDaemon : "
				+ current.isDaemon());
	}
	
}