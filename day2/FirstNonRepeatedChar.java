package string;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "aabbccdeff";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeated character is: " + c);
                break;
            }
        }
    }
}

