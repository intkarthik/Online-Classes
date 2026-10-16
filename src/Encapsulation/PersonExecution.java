package Encapsulation;

public class PersonExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		System.out.println(person.getName("Arunachalam", 123));
		System.out.println(person.getAge(27));
		System.out.println(person.getPhoneNo(9090909090L));
		System.out.println(person.getEmail("arun@gmail.com"));
		person.setPhoneNo(123, 9098989098L);
		System.out.println(person.getPhoneNo(909898098L));
	}

}
//Trainer Name : siva tejashwari Start Date : 24th june 2026 Timing : 7am to 9am Subject : SQL Batch Code : QCO-SOESQD-M66 Link : https://student.qspiders.com/stream/QCO-SOESQD-M66 Jun