package producer_consumer;

public class Company {

	int n;
	boolean f = false;

	// f=false: chance:producer
	// f=true: chance:consumer

	synchronized public void produceItem(int n) {
		if (f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("produced : " + this.n);
		f = true;
		notify();
	}

	synchronized public int itemConsume() {
		if (!f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("consumed : " + this.n);
		f = false;
		notify();
		return this.n;
	}

}
