package ConstructorChaining;

public class Demo {
	public Demo() {
		this(7);
		System.out.println("zero arg");
	}

	public Demo(int a) {
		this("hello");
		System.out.println("int arg");
	}

	public Demo(String a) {
		this(2, 4.3);
		System.out.println("String arg");
	}

	public Demo(int a, double b) {
		this(3.4, 5);
		System.out.println("int double arg");
	}

	public Demo(double a, int b) {
		System.out.println("double int arg");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
	}
}
