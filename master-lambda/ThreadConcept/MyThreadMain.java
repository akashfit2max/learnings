public class MyThreadMain {
	public static void main(String[] args) {

//		using runnable interface
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();

		
//		using the Thread class
		My2Thread thread2 = new My2Thread();
		thread2.run();

	}
}
