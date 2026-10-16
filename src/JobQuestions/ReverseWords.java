package JobQuestions;

import java.util.regex.Pattern;

public class ReverseWords {
	static String reverseWords(String str) {
		Pattern pattern = Pattern.compile("\\s");
		String[] words = pattern.split(str);
		String result = "";
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1)
				result = words[i] + result;
			else
				result = " " + words[i] + result;
		}
		return result;
	}

	public static void main(String[] args) {
		String s1 = "Welcome to geeksforgeeks";
		String s2 = "I love Java Programming";
		System.out.println(reverseWords(s1));
		System.out.println(reverseWords(s2));
	}
}
