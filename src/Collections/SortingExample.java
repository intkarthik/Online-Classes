package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingExample {
	// this program for pre -defined object sorting
	public static void main(String[] args) {
		Animals();
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(100);
		list.add(19);
		list.add(23);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reversing the given list : " + list);
		Collections.sort(list);
		System.out.println("Asc order list : " + list);
		Collections.reverse(list);
		System.out.println("Desc order list : " + list);
	}

	public static void Animals() {
		List<String> list = Arrays.asList("Lion", "Tiger", "Cheetah", "Elephant", "Badger");
		for (String animal : list) {
			System.out.print(animal + " ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

		System.out.println(list.contains("Tiger"));
	}

}
