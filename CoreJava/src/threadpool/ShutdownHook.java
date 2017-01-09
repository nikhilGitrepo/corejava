package threadpool;

public class ShutdownHook {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new MyThread());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		System.exit(0);
		System.out.println("Done");
		
	}
	
}

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println( 
				"["+ Thread.currentThread().getName() + "]"
				+ "- executing Shoutdown hook" );	
	}
}