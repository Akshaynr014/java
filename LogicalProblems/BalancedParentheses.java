package logicalProblem;

public class BalancedParentheses {
public static boolean isBalanced(String s) {
	int count = 0;
	for (char ch : s.toCharArray()) {
		if(ch=='(') {
			count++;
		}else if (ch==')'){
			count--;
		}
		if(count<0) {
			return false;
		}
	}
	return count==0;	
}
public static void main(String[] args) {
	System.out.println(isBalanced("((()))"));
	System.out.println(isBalanced("((())"));
}
}
