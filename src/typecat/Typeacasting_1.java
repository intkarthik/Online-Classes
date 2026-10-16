package typecat;

public class Typeacasting_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		narowing();
		narrowing_2();
		
	}

	public static void narowing() {
		float f = 90.00f;
		// long L = (long) f;
		int i = (int) f;
		long l = (long) f;
		byte b = (byte) f;
		char ch = (char) f;
		short s = (short) f;
		System.out.println("Float value is : " + f);
		System.out.println("long to float : " + l);
		System.out.println("Integer to float : " + i);
		System.out.println("byte to float : " + b);
		System.out.println("character to float : " + ch);
		System.out.println("short to float : " + s);
	}

	public static void narrowing_2() {
		int i = 98;
		byte b = (byte) i;
		short s = (short) i;
		char ch = (char) i;
		System.out.println("Integer : "+i);
		System.out.println("byte to int : " + b);
		System.out.println(ch);
	}

}
