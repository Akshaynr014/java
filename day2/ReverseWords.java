package string;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String[] words = sentence.split(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse().toString() + " ");
        }
    }
}
