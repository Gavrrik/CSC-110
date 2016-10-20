package lessons;
import java.util.Scanner;

public class TestScore2 {

  public static void main(String[] args) {
    int testScore;

	  // Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner (System.in);

		// Get a Test Score
		System.out.print("Enter your test Score:");
		testScore = keyboard.nextInt();

		// Was the score a good one.
		if (testScore < 60) {
      System.out.println("You fail.");
      System.out.println("Good luck next time.");
    }

    else {
      System.out.println("You Rock!!");
		}

		keyboard.close();
  }
}
   
