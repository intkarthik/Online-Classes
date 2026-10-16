package Abstraction;

public class Dell extends Computer{
	@Override
	void turnOn() {
		System.out.println("Dell is turning ON");
	}
	@Override
	void turnOff() {
		System.out.println("Once dell is on turn off ");
	}
}
