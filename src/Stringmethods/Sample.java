package Stringmethods;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s1 = "Apple";
		String s2 = "Apple";
		String s3 = "apple";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.substring(0, 3));
		String name = "Karthikeyan";
		System.out.println(name.substring(0, 7));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.toCharArray());
		for (int i = 0; i < name.length(); i++) {
			char target ='a';
			if (name.charAt(i) == target) {
				count++;
				System.out.println("Character a index is : " + i);
			}
		}
		System.out.println("Character of a count is : " + count);
	}

}
