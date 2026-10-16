package Inheritance_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********Parent classs************");
		Person person = new Person("Logu", "Prakash");
		person.showName();
		System.out.println("Child class inherits properties from the parent class");
		Student student = new Student("Arun", "Kumar", 98.56);
		student.showName();
		student.showDetails();
		System.out.println("Another child class also inherits properties from the base class");
		Employee employee = new Employee("Gokula", "Kannan", 120000);
		employee.showName();
		employee.showEmployeeDetails();
		
	}

}
