package finalexam;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int factorial = 1;
		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a whole number to calculate factors: ");

		number = input.nextInt();

		while (number != 0) {
			factorial = factorial * number;
			number--;
		}

		System.out.println("The Factoral is : " + factorial);

		input.close();
	}

}
