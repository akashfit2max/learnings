package producer_consumer;

public class Consumer extends Thread {

	Company company;

	public Consumer(Company company) {
		super();
		this.company = company;
	}

	public void run() {

		while (true) {
			this.company.itemConsume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
