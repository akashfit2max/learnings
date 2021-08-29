package work;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first thread : thread-akash

//		Runnable thread1 = () -> {
//			// this is the body of the thread
//
//			for (int i = 1; i < 10; i++) {
//				System.out.println("value of i is " + i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		};

//		Thread thread = new Thread(thread1);
//		thread.setName("akash");
//		thread.start();

		Runnable thread2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(2 + "*" + i + " = " + 2 * i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread thread3 = new Thread(thread2);
		thread3.setName("ashish");
		thread3.start();

	}

}
