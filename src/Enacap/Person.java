package Enacap;

public class Person {
	private String name = "Karthikeyan";
	private int age = 28;
	private long phoneNo = 9898989898L;
	private String email = "sk@gail.com";
	private String location;

	public String getLocation(String Name) {
		if (Name.equals(name))
			return location;
		else
			return "Invalid Location";
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName(int id) {
		if (id == 234)
			return name;
		else
			return "Invalid id number";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNo(int id) {
		if (id == 234)
			return phoneNo;
		else
			return 0;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
