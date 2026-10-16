package Multilevel_Inheritance;

public class SavingsAcc extends Account {
	double roi = 0.005;

	public void calculateRoi() {
		balance = balance + (balance * roi);
		System.out.println("Calculation afer roi : " + balance);
	}

}
