package Abstraction;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);

	public static void firstProgram() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void secondProgram() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number is : " + i);
			}
		}
	}

	public static void thirdProgram() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println("Even number is : " + i);
			}
		}
	}

	public static void fourthProgram() {
		int i = 2;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println("even number is : " + i);
			}
			i++;
		}
	}

	public static void fifthProgram() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers is : " + sum);
	}

	public static void seventhProgram() {
		int product = 1;
		for (int i = 1; i <= 5; i++) {
			product *= i;
		}
		System.out.println("Product of 1 to 5 is : " + product);
	}

	public static void tenthProgram() {
		int i = 1;
		int value;
		int count = 3;

		System.out.println("Enter the input to check +,- or zero : ");

		while (i <= count) {
			System.out.println("Enter the number : ");
			value = scanner.nextInt();
			if (value > 0) {
				System.out.println("Given number is +ve : " + value);
			} else if (value < 0) {
				System.out.println("Given number is -ve : " + value);
			} else {
				System.out.println("Given number is equals to zero");
			}
			i++;
		}
	}

	public static void twelveProgram() {
		int age;
		int count = 4;
		int i = 1;
		while (i <= count) {
			System.out.println("Enter the age : ");
			age = scanner.nextInt();
			if (age < 12) {
				System.out.println("Child");
			} else if (age > 13 && age <= 19) {
				System.out.println("Teenager");
			} else if (age >=20  && age <= 59) {
				System.out.println("Adult");
			} else if (age >= 60)
				System.out.println("Senior");
		}
	}

	public static void twentyProgram() {
		int[] values = { 1, 2, 3, 4, 5 };
		int target = 6;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == target) {
				System.out.println("Present");
				break;
			} else {
				System.out.println("Not present");
				break;
			}
		}
	}

	public static void lastProgram() {
		int sum = 0;
		int sumEvenOdd = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers is : " + sum);
	}

	public static void sumEvenOdd() {
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.println("sum of even numbers : " + sumEven);
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				sumOdd += i;
			}
		}
		System.out.println("Sum of odd numbers : " + sumOdd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstProgram();
		secondProgram();
		thirdProgram();
		fourthProgram();
		fifthProgram();
		seventhProgram();
		tenthProgram();
		twentyProgram();
		lastProgram();
		sumEvenOdd();
		twelveProgram();
	}

}
