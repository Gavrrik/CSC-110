package lessons;
import java.util.Scanner;

public class FahrenhietToCelsius {

  public static void main(String[] args) {

  // Create a Scanner object for keyboard input.
  Scanner input = new Scanner (System.in);

  // Prompt the user to enter Fahrenheit temperature
  System.out.print("Enter fahrenheit temperature:");

  double fahrenheit = input.nextDouble ();
  double celsius = 5 *(fahrenheit - 32)/9;

  // Celsius
  System.out.println("celsius:" + celsius);

  input.close();
  }
}
