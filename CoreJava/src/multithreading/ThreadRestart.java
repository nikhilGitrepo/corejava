package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadRestart {

	public static void main(String[] args) {
		
/*		Thread th = new ThRestart();
		System.out.println("State 1: "+ th.getState());
		th.start();
		System.out.println("State 2: "+ th.getState());

		System.out.println("Done");
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		th.start();
		System.out.println("State 4: "+ th.getState());*/
		
		System.out.println("------------------------------");
		Runnable rTh = new RunnableRestart();
		ExecutorService es = Executors.newFixedThreadPool(20);
		es.execute(rTh);
		
		es.shutdown();
		System.out.println(es.isTerminated());
		es.execute(rTh);
		
//		es.shutdown();
		while(!es.isTerminated()){
			System.out.println("running...." + Thread.currentThread().getName());
		}
	}
}

class ThRestart extends Thread{
	@Override
	synchronized public void run() {
		System.out.println("Running "
	+ Thread.currentThread().getName() 
	+ " thread...." 
	+ "State : "+ Thread.currentThread().getState());
		
	}
}

class RunnableRestart implements Runnable{
	@Override
	synchronized public void run() {
		System.out.println("Running Runnable Thread -  "
	+ Thread.currentThread().getName() 
	+ " thread...." 
	+ "State : "+ Thread.currentThread().getState());
		
	}
}
