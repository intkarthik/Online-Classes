package Exception;

public class ExceptionConcepts {
	static void arithMetic() {
		int a = 10, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("Cannot divide by zero");
		}
	}

	static void stringIndex() {
		String name = "Karthik";
		try {
			System.out.println(name.charAt(13));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("String index out of bound");
		}
	}

	static void arrayIndex() {
		int[] values = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(values[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index out of bound");
		}

	}

	public static void main(String[] args) {
		arithMetic();
		stringIndex();
		arrayIndex();
	}
}
