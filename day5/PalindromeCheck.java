package logicalProblem;

public class PalindromeCheck {
	public static void palindrom(String name) {
		String reverse = "";
		
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		if (name.equals(reverse)) {
			System.out.println("It is palindrome");

		} else {
			System.out.println("It is not palindrom");

		}
		
	}

		public static void palind(int num) {
			int original = num;
			int reversed = 0;
			
			while (num != 0) {
				int digit = num % 10;
				reversed =reversed* 10 + digit;
				num /= 10;
			}
			if (original == reversed) {
				System.out.println("Is palindrom");
			} else {
				System.out.println("It is not Palindrom");
			}
		}
	

	public static void main(String[] args) {
		palindrom("madaqm");
		palind(123321);
	}
}
