package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import JobQuestions.ReverseWords;

public class ListExample {

	public static void main(String[] args) {
		listExample();
		listExample1();
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		System.out.println();
		list.add("Rose");
		list.add("Lily");
		list.add("Sunflower");
		list.add("JAsmine");
		list.add("Hibiscus");
		System.out.println(list);
		for (String flower : list) {
			// System.out.print(flower.toCharArray()); // this line is used to store the
			// date in continuous
			System.out.print(flower + " ");
		}
	}

	public static void listExample() {
		// in this program we performed heterogeneous
		List list = new ArrayList();
		list.add("Karthikeyan");
		list.add("Arunachalam");
		list.add("Tamil");
		list.add("Logananth");
		list.add(28);
		list.add(null);
		list.add('A');
		list.add(3.45);
		list.add(true);
		System.out.println(list);
		System.out.println("Index of first element : " + list.getFirst());
		System.out.println("Index of last element : " + list.getLast());
		System.out.println("Based on given index : " + list.get(5));
		System.out.println(list.indexOf("Karthikeyan"));
		list.set(1, "Gokulakannan");
		System.out.println(list);
		list.addFirst("Ganesh");
		list.addLast(100);
		System.out.println(list);
		// System.out.println(list.lastIndexOf(list));
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	public static void listExample1() {
		List<Integer> list = Arrays.asList(1, 10, 2, 20, 3, 30);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(list.set(5, 100));
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		List<String> str = new ArrayList<>(Arrays.asList("Karthik", "Logu", "Tamil"));
		str.sort(Comparator.reverseOrder());
		System.out.println(str);
		list.forEach(n -> System.out.print(n + " "));
	}

}
