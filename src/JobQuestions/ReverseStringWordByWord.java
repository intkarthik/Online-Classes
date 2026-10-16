package JobQuestions;

public class ReverseStringWordByWord {
	
	/*
	 * Pattern.compile("\\s") creates a regex pattern to match whitespace
	 * characters. pattern.split(str) splits the input string into an array of words
	 * based on spaces. The reverseWords() method iterates through the words array.
	 */

	public static String reverseWords(String input) {
		// Check for edge cases (null or empty string)
		if (input == null || input.trim().isEmpty()) {
			return input;
		}

		// Split the string by one or more spaces "\\s+"
		String[] words = input.trim().split("\\s+");
		StringBuilder reversed = new StringBuilder();

		// Loop backwards through the words array
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);

			// Add a space between words, but not after the last word
			if (i > 0) {
				reversed.append(" ");
			}
		}

		return reversed.toString();
	}

	public static void main(String[] args) {
		String original = "I Love Programming";
		String result = reverseWords(original);

		System.out.println("Original: " + original);
		System.out.println("Reversed: " + result);
	}
}
