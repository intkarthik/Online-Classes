package Encapsulation;

public class ATM {
	private double amount = 4000;

	public double getAmount(int pin) {
		// String error="Invalid pin";
		if (pin == 3456)
			return amount;
		else
			return 0.00;
	}

	public void setAmount(double amount, int pin) {
		if (pin == 3456)
			this.amount = amount;
		else
			this.amount = 0.00;
	}

}
