import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static double celsius;
  public static double fahrenheit;

    public static void main(String[] args) {
      // Create a Scanner object for keyboard input.
      Scanner in = new Scanner (System.in);

      // Prompt the user to enter celsius temperature
      System.out.print("Enter celsius temperature: ");
      celsius = in.nextDouble ();

      fahrenheit = 9 * (celsius / 5)+32;

      // Fahrenheit
      System.out.println("Fahrenheit: " + fahrenheit);

      in.close();
    }
}
