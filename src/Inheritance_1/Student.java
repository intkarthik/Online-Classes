package Inheritance_1;

public class Student extends Person {

	double marks;

	public Student(String firstName, String lastName, double marks) {
		super(firstName, lastName);
		this.marks = marks;
		// TODO Auto-generated constructor stub
	}

	void showDetails() {
		System.out.println(this.firstName + " " + this.lastName + " score is " + marks);
	}

}
