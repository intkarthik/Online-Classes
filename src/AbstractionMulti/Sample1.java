package AbstractionMulti;

public abstract class Sample1 extends Sample {
	abstract void run();

	abstract void study();

	public Sample1() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Child class constructor");
	}

	public static void ride() {
		System.out.println("Ride the bike");
	}

	public void play() {
		System.out.println("Playing");
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
