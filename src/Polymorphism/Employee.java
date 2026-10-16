package Polymorphism;

public class Employee {

	Employee(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	Employee(double salary, String location) {
		System.out.println(salary);
		System.out.println(location);
	}

	public void employee() {
		System.out.println("Employee details");
	}

	public void employee(double increment) {
		System.out.println("Increment is : " + increment);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Karthikeyan", 27);
		Employee emp1 = new Employee(24000, "Erode");
		emp.employee();
		emp.employee(1000);
	}

}
