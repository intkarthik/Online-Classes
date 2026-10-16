package Multilevel_Inheritance;

public class Account {
	String name = "Arunacahalam";
	String accNo = "345656536762";
	long phoneNo = 8989898989L;
	double balance = 0.00;

	public void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("Account number : " + accNo);
		System.out.println("Mobile number is : " + phoneNo);
		System.out.println("Current balance is : " + balance);
	}

	public void deposit(double deposit) {
		balance = balance + deposit;
		System.out.println("Balance afer deposition : " + balance);
	}

	public void withdraw(double withdraw) {
		balance = balance - withdraw;
		System.out.println("Balance after withdraw : " + balance);
	}
	public void checkBalance() {
		System.out.println("Balance : " +balance);
		
	}
	public void demo() {
		 int num1 = 10;
         int num2 = 20;
         if ((num2 = 5) == num1)
         {
             System.out.print(num2);
         }
         else
         {
             System.out.print(++num2);
         }
	}public static void main(String[] args) {
		Account de=new Account();
		de.demo();
	     {
	         int a = 10;
	         int b = a;
	         a = 20;
	         System.out.println(a);
	         System.out.println(b);

	      }
	}
}
