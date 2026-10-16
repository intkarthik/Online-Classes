package Stringmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sample_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Logananth Sitheswaran";
		// convert string to character array
		char[] ch = name.toCharArray();
		for (char names : ch) {
			System.out.print(names);
		}
		System.out.println();
		// print character present in odd index
		for (int i = 0; i < name.length(); i++) {
			if (i % 2 != 0) {
				System.out.println("Index : " + i + " " + name.charAt(i));
			}
		}

		// print only upper case alphabets in given string
		System.out.print("Uppercase : ");

		for (int i = 0; i < name.length(); i++) {
			char upper = name.charAt(i);
			if (Character.isUpperCase(upper)) {
				System.out.print(upper);
			}
		}
		System.out.println();
		// print only alphabets in given string
		String mixedVar = "Learn java in 2 months !!!!";
		System.out.print("Only alphabets : ");
		for (int i = 0; i < mixedVar.length(); i++) {
			char result = mixedVar.charAt(i);
			if (Character.isLetter(result)) {
				System.out.print(result + " ");
			}
		}
		System.out.println();

		// reverse the string
		String names = "Ganesh";
		String reverse = "";
		for (int i = 0; i < names.length(); i++) {
			reverse = names.charAt(i) + reverse;
		}
		System.out.println("By using for loop : " + reverse);
		// reverse the string using string builder
		StringBuffer sb = new StringBuffer(name);
		System.out.println("Using string builder : " + sb.reverse());
		// reverse the string using list
		char[] reverse_1 = name.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c : reverse_1) {
			list.add(c);
		}
		Collections.reverse(list);
		Iterator it = list.iterator();
		System.out.print("By using list : ");
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
