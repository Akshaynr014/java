package logicalProblem;

public class CountDigits {
public static int digit(int n) {
	int count=0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
	public static void main(String[] args) {
		System.out.println(digit(1234567890));
	}
	
}	
	
	
	
//public static void main(String[] args) {
//	int [] digit = {1,2,3,4,5};
//	int count=0;
//	for (int i : digit) {
//		count++;
//	}
//	System.out.println(count);
//}
//}
