package lessons;

import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {

		double miles; // miles driven
		double gallons; // gallons used
		double mpg; // Miles-Per-Gallon

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user to enter Miles Driven
		System.out.print("Enter the miles driven: ");
		miles = keyboard.nextDouble();

		// Prompt the user to enter gallons used
		System.out.print("Enter gallons used: ");
		gallons = keyboard.nextDouble();

		// Calculate miles per gallon
		mpg = miles / gallons;

		// Display the miles-per-gallon
		System.out.print("The MPG is " + mpg);

		keyboard.close();
	}
	
}
