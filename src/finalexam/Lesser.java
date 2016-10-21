package finalexam;

import java.util.Scanner;

public class Lesser {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println("Enter another number ");
		int first = input.nextInt();
		int first1 = input.nextInt();

		System.out.println("The smallest number is:");
		System.out.println(Math.min(first, first1));

		input.close();
	}
	
}
