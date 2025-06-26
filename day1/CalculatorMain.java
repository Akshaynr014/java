package oops;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 CalculatorInterface calculator = new Calculator();
		 
		 System.out.println("enter a number:");
		 int a=scanner.nextInt();
		 
		 System.out.println("enter a number:");
		 int b = scanner.nextInt();
		 
		 
		 System.out.println("Addition:"+calculator.add(a, b));
		 System.out.println("subtraction:"+calculator.sub(a, b));
		 System.out.println("multiplication:"+calculator.mul(a, b));
		 System.out.println("division:"+calculator.div(a, b));
		 System.out.println("modulos:"+calculator.mod(a, b));

		 scanner.close();
	}

}
