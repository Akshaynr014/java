package logicalProblem;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a armstrongNumber:");
		int num = scanner.nextInt();
		int original = num;
		int result = 0;
		int n = String.valueOf(num).length();
		while (num != 0) {
			int digit = num % 10;
			result += Math.pow(digit, n);
			num /= 10;
		}

		if (result == original) {
			System.out.println("It is ArmStrong Number");
		} else {
			System.out.println("It is not Armstrong Number");
		}
		scanner.close();
	}

}
