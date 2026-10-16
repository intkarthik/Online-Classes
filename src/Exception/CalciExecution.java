package Exception;

public class CalciExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci calci = new Calci();
		calci.add1(10, 20, 30, 40, 50);
		// Advcalci adv = (Advcalci) calci;
		Calci c = new Advcalci();
		c.add1(1, 2, 3, 4, 5);

	}
}
