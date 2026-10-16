package Exception;

public class Advcalci extends Calci {
	public void add2() {
		int a = 10;
		int b = 20;
		int sum = 0;
		sum = a + b;
		System.out.println(sum);
	}

	@Override
	public void name() {
		System.out.println("Arunachalam");
	}
}
