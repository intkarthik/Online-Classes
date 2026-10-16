package Objects;

public class StaticNonstatic {
	String name;
	String accNo;
	double balance;
	String ifsc;
	String bankName;
	static String branchName = "Erode";

	public static void main(String[] args) {
		StaticNonstatic obj = new StaticNonstatic();
		obj.printDetails("Arunacahalam", "Bhavani", 1000.00, "idin338380", "123444");
		obj.printDetails("Karthikeyan", "Erode", 10000.00, "idin338380", "2344555");
	}

	static void branchName() {
		System.out.println(branchName);
	}

	public void printDetails(String name, String accno, double balance, String ifsc, String branchName) {
		System.out.println(name);
		System.out.println(accno);
		System.out.println(balance);
		System.out.println(ifsc);
		System.out.println(branchName);
		System.out.println("**********Next AccDetails*********8");
	}
}
