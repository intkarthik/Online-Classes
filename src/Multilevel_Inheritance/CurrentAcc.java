package Multilevel_Inheritance;

public class CurrentAcc extends Account {
	double minBalaace = 50000.00;

	public void checkMinbalance() {
		System.out.println("Minimum balance is : " + minBalaace);
	}
}
