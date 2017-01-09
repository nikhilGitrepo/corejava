package multithreading;

class TestMultiNaming1 extends Thread {
	public void run() {
		try {
			
			for(int i=0;i<5;i++){
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+ "["+ i + "]");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ "] running...");
	}

	public static void main(String args[]) {
		TestMultiNaming1 t0 = new TestMultiNaming1();
		TestMultiNaming1 t1 = new TestMultiNaming1();
		System.out.println(Thread.currentThread().getName()+ "] Name of t0:" + t0.getName());
		System.out.println(Thread.currentThread().getName()+ "] Name of t1:" + t1.getName());

		long start = System.currentTimeMillis();

		t0.start();
/*		try {
			t0.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t1.start();
		
		try {
			t0.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
//		t0.setName("Nikhil Hiremath - t0");
//		System.out.println(Thread.currentThread().getName()+ "] After changing name of t0:" + t0.getName());
	}
}
