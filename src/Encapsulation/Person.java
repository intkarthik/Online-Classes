package Encapsulation;

public class Person {
	private String name = "Arunachalam";
	private int age = 27;
	private long phoneNo = 9090909090L;
	private String email = "arun@gmail.com";

	public String getName(String name, int id) {
		if (id == 123)
			return name;
		else
			return "Invalid user";

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge(int age) {
		if (age == this.age)
			return age;
		else
			return 0;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPhoneNo(double phoneNo) {

		return phoneNo;

	}

	public void setPhoneNo(int id, long phoneNo) {
		if (id == 123)
			this.phoneNo = phoneNo;
		else
			System.out.println("Enter the valid id number");
	}

	public String getEmail(String email) {
		if (email == this.email)
			return email;
		else
			return "Invalid email";
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
