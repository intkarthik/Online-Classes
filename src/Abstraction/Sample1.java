package Abstraction;

public class Sample1 extends Sample {
	public Sample1() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Child class constructor");
	}
	@Override
	public void eat() {
		System.out.println("Eating");
	}
	@Override
	public void sleep() {
		System.out.println("Sleeeping");
	}
}
