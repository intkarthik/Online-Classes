package HierarchicalInheritance;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
		Parrot parrot = new Parrot();
		parrot.eat();
		parrot.fly();
		Sparrow sparrow = new Sparrow();
		sparrow.eat();
		sparrow.fly();
	}

}
