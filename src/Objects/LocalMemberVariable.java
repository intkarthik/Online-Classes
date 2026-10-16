package Objects;

public class LocalMemberVariable {
	static String username = "Arun";
	String name = "Loga";

	public static void test() {
		// local variable have an high priority
		String username = "Karthik";
		System.out.println(username);
		// to access global variable we use classname and variable name
		System.out.println(LocalMemberVariable.username);
		// System.out.println(name);
	}

	void test_1() {
		System.out.println(username);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		LocalMemberVariable obj = new LocalMemberVariable();
		obj.test_1();
	}

}
