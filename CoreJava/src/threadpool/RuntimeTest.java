package threadpool;

public class RuntimeTest {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
//			runtime.exec("firefox");

			System.out.println( "runtime.availableProcessors : " + runtime.availableProcessors());

//			runtime.exit(0);
//			runtime.exit(1);
//			runtime.exit(2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
