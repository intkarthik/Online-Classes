package Inheritance_1;

public class Employee extends Person {
	public Employee(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	double salary;

	void showEmployeeDetails() {
		System.out.println(this.firstName + " " + this.lastName + " salary is : " + salary);
	}
}
