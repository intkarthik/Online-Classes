package Stringmethods;

public class ObjectsAndLitrerals {

	public static void main(String[] args) {
		/*
		 * string class save the name data and different address
		 */
		// TODO Auto-generated method stub
		String name = new String("Karthikeyan");
		String name_1 = new String("Karthikeyan");
		System.out.println(name);
		System.out.println(name_1);
		System.out.println(name == name_1);// double equals operator check the same address or not
		String loc = "Bhavani";
		String loc_1 = "Bhavani";
		System.out.println(loc);
		System.out.println(loc_1);
		System.out.println(loc == loc_1);
	}

}
