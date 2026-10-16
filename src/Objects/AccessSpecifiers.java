package Objects;

public class AccessSpecifiers {

	public static int a = 10;
	protected static int b = 20;
	private static int c = 30;
	static int d = 40;

	public String name = "Karthik";
	protected String location = "Bhavani";
	private int age = 27;
	char gender = 'M';

	public static void m1() {
		System.out.println("Public");
	}

	protected static void m2() {
		System.out.println("Protected");
	}

	private static void m3() {
		System.out.println("Private");
	}

	static void m4() {
		System.out.println("Default");
	}

	/////////////////////////////////////////////////////////////////////
	public void m5() {
		System.out.println("public non static method");
	}

	protected void m6() {
		System.out.println("Protected non static method");
	}

	private void m7() {
		System.out.println("Private non static method");
	}

	public static void main(String[] args) {
		System.out.println(a);
		m1();
		System.out.println(b);
		m2();
		System.out.println(d);
		m4();
		System.out.println(c);
		m3();

		// non variable and methods accessing by creation of objects
		AccessSpecifiers obj = new AccessSpecifiers();
		obj.m5();
		obj.m6();
		obj.m7();
		// AccessSpecifiers obj1 = new AccessSpecifiers("Arunacalam", "Bhavani", 27,
		// 'M');
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public AccessSpecifiers() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * AccessSpecifiers(String name, String location, int age, char gender) {
	 * System.out.println(this.age); System.out.println(this.name);
	 * System.out.println(this.location); System.out.println(this.gender); }
	 */

}
