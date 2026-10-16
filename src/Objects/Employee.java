package Objects;

public class Employee {
	int empId;
	String name;
	double salary = 10000;
	long phoneNo = 7010101010L;
	String email;
	String password;
	static String companyName = "Infosys";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.displayEmployeeDetails(1, "Karthikeyan", 15000, "Karthik@gmail.com", "Logan");
		displyCompanyName();
		emp.updatePhoneNo(88989899);
		emp.updatedSalary(24500);
		System.out.println("************New Employee details*************");
		emp.displayEmployeeDetails(2, "Arunacahalam", 12300, "Arun@gmail.com", "Arun");

	}

	void displayEmployeeDetails(int empid, String name, double salary, String email, String password) {
		System.out.println("Employee id : " + empid);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Email id : " + email);
		System.out.println("Password : " + password);
		System.out.println("Phone number : " + phoneNo);
	}

	static void displyCompanyName() {
		System.out.println("Company Name : " + companyName);
	}

	void updatePhoneNo(long newPhoneno) {
		phoneNo = newPhoneno;
		System.out.println("Updated Phone number :" + phoneNo);
	}

	void updatedSalary(double newSalary) {
		salary = newSalary;
		System.out.println("Updated salary : " + salary);
	}
}
