package Polymorphism;

public class Animal {
	void move() {
		System.out.println("The animal is running");
	}

	public class Cat extends Animal {
		@Override
		void move() {
			System.out.println("Cat is running");
		}
	}

	public class Dog extends Animal {
		@Override
		void move() {
			System.out.println("Dog is running");
		}

	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move();
		
	}
}
