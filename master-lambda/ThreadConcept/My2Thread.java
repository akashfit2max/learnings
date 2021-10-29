

public class My2Thread extends Thread {

	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println("2 thread i " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
