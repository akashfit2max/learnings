package ref;

import java.time.LocalDate;

public class Stuff {

	public static void doStuff() {
		System.out.println("i am doing a task");

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	}

	public static void threadtask() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void printNumber() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
