package logicalProblem;

public class CountVowels {
	public static void main(String[] args) {
		String name = "helloWoaaarliiieeeooouuudAkshay";
		name = name.toLowerCase();
		int vowels = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}

		}
		System.out.println(vowels);
	}
}
