package Upacasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WE CAN ACCES ONLY PARENT CLASS ATTRIBUTES BECAUSE OF UPCASTING
		Sample sample = new Demo();
		// sample.eat(); //we cannot access because upcasting
		// sample.fly(); //we cannot access because upcasting
		sample.sleep();
		sample.Age();
		System.out.println(sample.age);
		Demo demo = new Demo();
		demo.sleep();
		demo.eat();
		System.out.println(demo.spots);
		demo.Spots();
		demo.Age();
		System.out.println(demo.age);
		Sample_1 sample1 = new Sample_1();
		sample1.sleep();
		sample1.eat();
		sample1.Spots();
		sample1.Age();
		System.out.println(sample1.age);
		System.out.println(sample1.spots);
		sample1.fly();
	}

}
