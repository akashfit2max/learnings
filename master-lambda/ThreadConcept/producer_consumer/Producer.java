package producer_consumer;

public class Producer extends Thread {

	Company company;

	public Producer(Company company) {
		super();
		this.company = company;
	}

	public void run() {
		int i = 1;
		while (true) {
			this.company.produceItem(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}

	}
}
