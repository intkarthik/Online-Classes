package Objects;

public class Customer {
	int id;
	String name;
	String email;
	String password;
	long phoneNumber;
	char gender;
	String productName;
	double productPrice;

	public void customerDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("*********Customer details*********");
		System.out.println("Customer id : " + id);
		System.out.println("Customer name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
	}

	public void customerGenderPhone() {
		System.out.println("*************Gender and Phone number details************");
		System.out.println("Gender : " + gender);
		System.out.println("PhoneNumber : " + phoneNumber);
	}

	public void productDetails() {
		System.out.println("***********Product details**************");
		System.out.println("Product name : " + productName);
		System.out.println("Product price : " + productPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer();
		obj.id = 1;
		obj.name = "Karthikeyan";
		obj.email = "sk@gmail.com";
		obj.password = "hdhe";
		obj.phoneNumber = 9898989898L;
		obj.gender = 'M';
		obj.productName = "Macbook Air";
		obj.productPrice = 89000.00;
		obj.customerDetails();
		obj.customerGenderPhone();
		obj.productDetails();

	}

}

/*
 * public Customer(int id, String name, String email, String password) { // TODO
 * Auto-generated constructor stub System.out.println(this.id = id);
 * System.out.println(this.name = name); System.out.println(this.email = email);
 * System.out.println(this.password = password); }
 */
