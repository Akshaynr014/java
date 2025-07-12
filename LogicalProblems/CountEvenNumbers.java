package logicalProblem;

public class CountEvenNumbers {
	
	public static int countEven(int[] num) {
		int count = 0;
		for (int i : num) {
			if(i%2==0) {
				count++;
			}
		}
		return count; 
	}
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10,12,14};
		System.out.println(countEven(num));
	}

//	public static void main(String[] args) {
//		int[] num = {1,2,3,4,5,6,7,8,9,10,12,14};
//		int count = 0;
//		for (int i : num) {
//			if (i%2==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//
//	}

}
