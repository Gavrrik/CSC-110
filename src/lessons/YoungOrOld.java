package lessons;

import java.util.Scanner;

public class YoungOrOld {

	public static void main(String[] args) {
		int age;

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a person's age
		System.out.print("Enter your age:");
		age = keyboard.nextInt();

		// is the person young or old.
		if (age > 30) {
			System.out.println("Sorry Your Old!");
			System.out.println(":(");
		}

		else {
			System.out.println("You're young and you have a whole future ahead, WorkHard!.");
		}

		keyboard.close();
	}
	
}
