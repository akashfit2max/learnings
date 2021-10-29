class UserThread extends Thread {
	public void run() {
		System.out.println("this is my own created thread i.e userdefined thread");
	}
}

public class ThreadOp {

	public static void main(String[] args) {
		System.out.println("start.......");

		int x = 10 + 2;
		System.out.println("the sum is " + x);

		// finding the name of the current running thread
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println("current running thread is " + name);

		// changinh name of the thread
		thread.setName("Akash");
		System.out.println("new name of the thread is " + thread.getName());

		System.out.println("id of the thread " + thread.getId());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 5 seconds sleep.

		// going to start used defined thread
		UserThread thread2 = new UserThread();
		thread2.start();

		System.out.println("end......");
	}

}
