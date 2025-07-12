package logicalProblem;

public class ReverseString {
public static String reverse(String name) {
	String reverse = "";
	for(int i=name.length()-1;i>=0;i--) {
		reverse+=name.charAt(i);
	}
	return reverse;
}
public static void main(String[] args) {
	System.out.println(reverse("akshay"));
}
}
