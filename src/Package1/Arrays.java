package Package1;

public class Arrays {

	public static void main(String[] args) {
		Array_1();
		OddElement();
		EvenElement();
		Elements();
		EvenIndex();
		SumElements();
	}

	static void Array_1() {
		int[] number = { 10, 30, 17, 26, 37 };
		for (int i : number) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
	}

	static void OddElement() {
		int[] number = { 10, 30, 17, 26, 37 };
		for (int i : number) {
			if (i % 2 != 0) {
				System.out.println("Odd number is : " + i + " ");
			}
		}

	}

	static void EvenElement() {
		int[] number = { 10, 30, 17, 26, 37 };
		for (int i : number) {
			if (i % 2 == 0) {
				System.out.println("Even number is : " + i + " ");
			}
		}
	}

	static void Elements() {
		int[] number = { 9, 30, 17, 26, 37 };
		for (int i : number) {
			if (i % 5 == 0) {
				System.out.println("The number divisible by 5 : " + i);
			}
		}
		for (int j : number) {
			if (j % 3 == 0) {
				System.out.println("The number divisible by 3 : " + j);
			}
		}
	}

	static void EvenIndex() {
		int[] number = { 9, 30, 17, 26, 37 };
		System.out.println("Elements at even index:");
		for (int i = 0; i < number.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Index " + i + " : " + number[i]);
			}
		}
	}

	static void SumElements() {
		int sum = 0;
		int[] number = { 9, 30, 17, 26, 37 };
		for (int i : number) {
			sum += i;
		}
		System.out.println("Sum of given arrays : " + sum);
	}
	
	

}
