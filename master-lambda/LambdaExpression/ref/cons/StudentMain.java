package ref.cons;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("learning constructor reference");

//		returning the student object using lambda expression
		Provider provider = () -> {
			return new Student();
		};

		Student student = provider.getStudent();
		student.display();

		Provider provider2 = Student::new;
		Student student1 = provider.getStudent();
		student.display();

	}

}
