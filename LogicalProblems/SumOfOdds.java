package logicalProblem;

import java.util.Scanner;

public class SumOfOdds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a start number:");
		int start = scanner.nextInt();
		System.out.println("Enter a End Number:");
		int end = scanner.nextInt();
		int sumOfOdds = 0;

		for (int i = start; i < end; i++) {
			if (i % 2 != 0) {
				sumOfOdds += i;
			}
		}
		System.out.println(sumOfOdds);
		scanner.close();
	}

}
