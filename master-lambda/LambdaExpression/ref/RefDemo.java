package ref;

public class RefDemo {

	public static void main(String[] args) {

		System.out.println("method reference");

		// WorkInter workInter = () -> System.out.println("this is do task new method");
		//
		// workInter.doTask();

		// static method refer kiya h
		// className::methodName without paraenthesis
		WorkInter workInter = Stuff::doStuff;
		workInter.doTask();

		// thread use krna with method reference
//		Runnable runnable = Stuff::threadtask;
//		Thread thread = new Thread(runnable);
//		thread.start();

		// reffering non static method using object instance
		// object::methodName
		Stuff stuff = new Stuff();
		Runnable runnable1 = stuff::printNumber;
		Thread thread2 = new Thread(runnable1);
		thread2.start();

	}

}
