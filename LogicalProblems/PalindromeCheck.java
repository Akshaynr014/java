package logicalProblem;

public class PalindromeCheck {

    // Method to check string palindrome
    public static void palindrom(String name) {
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }

        if (name.equals(reverse)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    // Method to check number palindrome
    public static void palind(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }

    public static void main(String[] args) {
        palindrom("madam");     // String palindrome check
        palind(12321);          // Number palindrome check
    }
}

