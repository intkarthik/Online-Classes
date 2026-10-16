package Objects;

public class Customer_1 {
	int id;
	String name;
	String email;
	String password;
	long phoneNumber;
	char gender;
	String productName;
	double productPrice;
	String brand;

	public Customer_1(int id, String name, String email, String password) {
		System.out.println("*************Customer details**********");
		// TODO Auto-generated constructor stub
		System.out.println(this.id = id);
		System.out.println(this.name = name);
		System.out.println(this.email = email);
		System.out.println(this.password = password);
	}

	public Customer_1(long phoneNumber, char gender) {
		System.out.println("*********Customer contact and gender**********");
		System.out.println(this.phoneNumber = phoneNumber);
		System.out.println(this.gender = gender);
	}

	public Customer_1(String brand, String productName, Double productPrice) {
		System.out.println("************Product details***************");
		// TODO Auto-generated constructor stub
		System.out.println(this.brand = brand);
		System.out.println(this.productName = productName);
		System.out.println(this.productPrice = productPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Customer_1(12, "Karthikeyan", "sk@gmail.com", "Karthik");
		new Customer_1(9090909090L, 'M');
		new Customer_1("Apple", "Macbook air", 89000.00);
		System.out.println("----------------------Next customer details-------------------------------");
		new Customer_1(13, "Arunacahalam", "sks@gmail.com", "Arun");
		new Customer_1(9090908980L, 'M');
		new Customer_1("Apple", "Macbook air M5", 890090.00);
	}

}
