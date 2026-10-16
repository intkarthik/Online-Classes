package Abstraction;

public class SampleExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 sam = new Sample1();// it will call super class constructor and child constructor both
		sam.eat();
		sam.sleep();
		sam.write();
		Sample.read();
		Sample1.read();
	}

}
