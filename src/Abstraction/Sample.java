package Abstraction;

public abstract class Sample {
	public Sample() {
		// TODO Auto-generated constructor stub
		System.out.println("Abstract constructor");
	}

	public abstract void eat();

	abstract void sleep();

	public void write() {
		System.out.println("Writing");
	}

	public static void read() {
		System.out.println("Reading");
	}
}
