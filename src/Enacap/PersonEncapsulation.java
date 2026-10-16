package Enacap;

public class PersonEncapsulation {

	public static void main(String[] args) {

		Person person = new Person();
		System.out.println("Name : " + person.getName(234));
		System.out.println("Age : " + person.getAge());
		System.out.println("Contact Number : " + person.getPhoneNo(234));
		System.out.println("Email id : " + person.getEmail());
		System.out.println("Location : " + person.getLocation("Bhavani"));
		person.setLocation("Erode");
		System.out.println("Location : " + person.getLocation("Karthikeyan"));
		person.setPhoneNo(7878787878L);
		System.out.println("Updated contact number : " + person.getPhoneNo(234));
	}

}
