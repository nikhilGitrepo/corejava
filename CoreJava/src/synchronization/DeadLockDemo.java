package synchronization;

public class DeadLockDemo {

	public static void main(String[] args) {
		Thread lt1 = new LockThread();
		Thread lt2 = new LockThread2();
		
		lt1.start();
		lt2.start();
	}

}

class Resource {
	public static final String name = "Nikhil Hiremath";
	public static final String mom = "Kirti Hiremath";
}

class LockThread extends Thread {

	@Override
	public void run() {

		synchronized(Resource.name){
			
			System.out.println(Thread.currentThread().getName() + " has acquired lock on " + Resource.name);
	
			try {
				// sleep: doesn't release locks on thread
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			System.out.println(
					Thread.currentThread().getName()
					+": Intermitantly waiting for Lock on '"
					+ Resource.mom 
					+"' to be released"
					);
			
			synchronized(Resource.mom){
				System.out.println(Thread.currentThread().getName() + " has acquired lock on " + Resource.mom);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	}
}

class LockThread2 extends Thread {

	@Override
	public void run() {

		synchronized(Resource.mom){
			
			System.out.println(Thread.currentThread().getName() + " has acquired lock on " + Resource.mom);
	
			try {
				// sleep: doesn't release locks on thread
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			System.out.println(
					Thread.currentThread().getName()
					+": Intermitantly waiting for Lock on '"
					+ Resource.name 
					+"' to be released"
					);
			synchronized(Resource.name){
				System.out.println(Thread.currentThread().getName() + " has acquired lock on " + Resource.name);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
