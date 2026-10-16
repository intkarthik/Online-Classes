package AbstractionMulti;

public class Sample2 extends Sample1 {
	public Sample2() {
		// TODO Auto-generated constructor stub
		System.out.println("child child constructor");
	}
	@Override
	public void run() {
		System.out.println("Running");
	}

	@Override
	void study() {
		System.out.println("Studying");
		
	}
}
