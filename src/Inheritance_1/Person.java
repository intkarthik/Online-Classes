package Inheritance_1;

public class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void showName() {
		System.out.println("Name of the Candidate is : " + this.firstName + " " + this.lastName);
	}

	public static void main(String[] args) {
		Person person = new Person("Gokul", "Prasanth");
		person.showName();
	}
}
