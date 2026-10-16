package Stringmethods;

public class Sample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "KarthiKeyan";
		// converting given string to character array
		char[] ch = name.toCharArray();
		for (char i : ch) {
			System.out.print(i);
		}
		// print character present in odd index
		System.out.println();
		for (int i = 0; i < name.length(); i++) {
			if (i % 2 != 0) {
				System.out.println("Index " + i + " " + name.charAt(i));
			}
		}
		System.out.println(name.toUpperCase());
		// Only print alphabets in given string
		System.out.print("Uppercase : ");
		for (int i = 0; i < name.length(); i++) {
			char value = name.charAt(i);
			if (Character.isUpperCase(value)) {
				System.out.print(value + " ");
			}
		}
		System.out.println();
		// print only alphabets in given string
		System.out.print("Only alphabets : ");
		String s = "hello 123 EVERYONE !@";
		for (int i = 0; i < s.length(); i++) {
			char alpha = s.charAt(i);
			if (Character.isLetter(alpha)) {
				System.out.print(alpha + " ");
			}
		}
		System.out.println();
		// reverse the given string
		String og_name = "Arunachalam";
		StringBuffer sb = new StringBuffer(og_name);
		System.out.println(sb.reverse());

		StringBuilder sbb = new StringBuilder(name);
		System.out.println(sbb.reverse());
	}

}
