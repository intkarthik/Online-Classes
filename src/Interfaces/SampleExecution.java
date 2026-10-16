package Interfaces;

public class SampleExecution implements Sample, Sample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleExecution sam = new SampleExecution();
		sam.name();
		System.out.println("age is : " + Sample.age);
		System.out.println(Sample_1.location);
		sam.travel();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name is : Karthikeyan ");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Travelling............");
	}

}
