package Abstraction;

public class Hp extends Computer{
	@Override
	void turnOn() {
		System.out.println("Hp is turning ON");
	}
	@Override
	void turnOff() {
		System.out.println("Once hp is on turn off ");
	}
}
