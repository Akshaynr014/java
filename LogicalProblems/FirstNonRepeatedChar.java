package logicalProblem;

public class FirstNonRepeatedChar {

	private static boolean found;

	public static void main(String[] args) {
		String name = "akshaykshy";
		boolean isRepeated = false;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			isRepeated = false;

			for (int j = 0; j < name.length(); j++) {
				if (i != j && ch == name.charAt(j)) {
					isRepeated = true;
					break;
				}
			}
			if (!isRepeated) {
				System.out.println(ch);
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("All are repeted character");
		}
	}

}
