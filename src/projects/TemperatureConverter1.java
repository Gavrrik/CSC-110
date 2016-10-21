package projects;

import java.util.Scanner;

// Lab#1-C2F\F2C
public class TemperatureConverter1 {
	
	public static void main(String[] args) {
			// Create a Scanner object for keyboard input.
			// Note that here I used "Scanner in" instead of "Scanner input"
			// this shows that you can use any of the two
			// but remember that all your code needs to follow the one that you
			// used.
			Scanner in = new Scanner(System.in);

			// Ask the user if he wants to convert
			System.out.print("Type 1 to convert Fahrenheit to Celsius.\n");
			System.out.print("Type 2 to convert Celsius to Fahrenheit.\n");
			int choice = in.nextInt();

			// What did he or she choose?
			if (choice == 1) {
				// Prompt the user to enter Fahrenheit temperature
				System.out.print("Enter fahrenheit temperature:");

				double fahrenheit = in.nextDouble();
				double celsius = 5 * (fahrenheit - 32) / 9;

				// Celsius
				System.out.println("celsius:" + celsius);
			}

			else {
				// Prompt the user to enter celsius temperature
				System.out.print("Enter celsius temperature: ");

				double celsius = in.nextDouble();
				double fahrenheit = 9 * (celsius / 5) + 32;

				// Fahrenheit
				System.out.println("Fahrenheit: " + fahrenheit);
			}

			in.close();
	}

}
