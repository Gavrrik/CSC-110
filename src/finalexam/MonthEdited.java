package finalexam;

//This is the same Program as the original I did in the test, 
//But this one is more "compact" as I used == and || to help me shorten the code.

import java.util.Scanner;

public class MonthEdited {

	public static void main(String[] args) {

		// Create a Scanner object for keyboard input.
		Scanner input = new Scanner(System.in);

		// Get month number
		System.out.print("Enter a month as an integer 1-12:");
		int choice = input.nextInt();
		int number = 12;

		if (choice == 12 || choice == 1 || choice == 2) {
			System.out.println("WINTER MONTH");
		}

		if (choice == 3 || choice == 4 || choice == 5) {
			System.out.println("SPRING MONTH");
		}

		if (choice == 6 || choice == 7 || choice == 8) {
			System.out.println("SUMMER MONTH");
		}

		if (choice == 9 || choice == 10 || choice == 11) {
			System.out.println("FALL MONTH");
		}

		if (choice > number) {
			System.out.println("INVALID NUMBER");
		}

		input.close();
	}

}