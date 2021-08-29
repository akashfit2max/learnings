package work;

public class Main {

	public static void main(String[] args) {
		System.out.println("lambda expression practical");

		/*
		 * class bana k use krna
		 * 
		 * Myinter myinter = new MyInterImpl(); myinter.sayHello();
		 * 
		 */

		/*
		 * anonymous class use kia h
		 * 
		 * Myinter myinter = new Myinter() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("using anonymous class"); } }; myinter.sayHello();
		 */

		// using our interface with the help of lambda

		Myinter i = () -> System.out.println("using lambda expression");
		i.sayHello();

		SumInter sumInter = (a, b) -> a + b;
		System.out.println(sumInter.sum(6, 5));
		System.out.println(sumInter.sum(5, 3));

		StringLength stringLength = str -> str.length();
		System.out.println("length is " + stringLength.getLength("Akash Kumar Sahoo"));

	}

}
