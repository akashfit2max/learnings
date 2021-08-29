import threadclass.My2Thread;

public class MyThreadMain {
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();

		My2Thread thread2 = new My2Thread();
		thread2.run();

	}
}
