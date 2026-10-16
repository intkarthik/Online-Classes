package Overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Parent class***");
		Animal animal = new Animal();
		animal.move();
		animal.makeSound();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal fish = new Fish();
		dog.move();
		dog.makeSound();
		cat.move();
		cat.makeSound();
		fish.move();
		fish.makeSound();
	}

}
