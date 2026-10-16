package typecat;

public class Tyecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		widening();
		widening_1();
		widening_2();
	}

	public static void widening() {
		byte a = 78;
		int b = a;
		long c = a;
		float d = a;
		double e = a;
		char ch = (char) a;
		System.out.println("byte value  : " + a);
		System.out.println("Integer to byte :" + b);
		System.out.println("long to byte : " + c);
		System.out.println("float to byte : " + d);
		System.out.println("double to byte : " + e);
		System.out.println("character to byte : " + ch);
	}

	public static void widening_1() {
		long l = 2345;
		double d = l;
		System.out.println("Long vaue is : " + l);
		System.out.println("double to long is : " + d);
	}

	public static void widening_2() {
		char ch = 'J';
		int i = ch;
		long l = ch;
		float f = ch;
		double d = ch;
		System.out.println("Char value is : " + ch);
		System.out.println("Integer to char : " + i);
		System.out.println("long to char : " + l);
		System.out.println("float to char : " + f);
		System.out.println("double to char : " + d);
	}

}
