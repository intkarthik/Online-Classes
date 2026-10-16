package JobQuestions;

import java.util.Scanner;

public class SecLargestArray {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Second Largest element is : " + secondLargest());
	}

	public static int secondLargest() {
		int[] size = new int[5];
		int largest = -1;
		int secLargest = -1;
		System.out.println("Enter the elements : ");
		for (int i = 0; i < size.length; i++) {
			int values = scanner.nextInt();
			if (values > largest) {
				secLargest = largest;
				largest = values;
			} else if (values < largest && values > secLargest) {
				secLargest = values;
			}
		}
		return secLargest;
	}
}
