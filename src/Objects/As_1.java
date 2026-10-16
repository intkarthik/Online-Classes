package Objects;

public class As_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AccessSpecifiers.a);
		AccessSpecifiers.m1();
		System.out.println(AccessSpecifiers.b);
		AccessSpecifiers.m2();
		System.out.println(AccessSpecifiers.d);
		AccessSpecifiers.m4();
		/*
		 * System.out.println(AccessSpecifiers.c); AccessSpecifiers.c();these two are
		 * private specifiers
		 */
		System.out.println("Non static variable accessing in other classes");
		AccessSpecifiers obj = new AccessSpecifiers();
		System.out.println(obj.gender);
		System.out.println(obj.name);
		System.out.println(obj.location);
		obj.m5();
		obj.m6();

	}

}
