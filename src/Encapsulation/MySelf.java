package Encapsulation;

public class MySelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		System.out.println("By using getter method");
		System.out.println(atm.getAmount(3456));
		System.out.println("By using setter method to update the value");
		atm.setAmount(5000, 3456);
		System.out.println(atm.getAmount(3456));
	}

}
