package logicalProblem;

public class missingNumber {
public static void main(String[] args) {
	int[] number= {1,2,3,5,6};
	int n=number.length+1;
	int total = n*(n+1)/2;
	int sum = 0;
	for (int i : number) {
		sum+=i;
	}
	
	int missing=total-sum;
	System.out.println(missing);
}
}
