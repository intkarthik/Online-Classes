package Multilevel_Inheritance;

public class AccountExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********Savings Account*************");
		SavingsAcc savings = new SavingsAcc();
		savings.displayDetails();
		savings.deposit(1000);
		savings.withdraw(300);
		savings.checkBalance();
		savings.calculateRoi();
		System.out.println("********Current Account************");
		CurrentAcc current = new CurrentAcc();
		current.displayDetails();
		current.deposit(5000);
		current.withdraw(3000);
		current.checkBalance();
		current.checkMinbalance();
	}

}
