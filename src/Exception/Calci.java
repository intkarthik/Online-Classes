package Exception;

public class Calci {
	public void add1(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		System.out.println("sum of values is : " + sum);
	}

	public void name() {
		System.out.println("Karthikeyan");
	}
}
