import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)   
     {
      
        {
      //Create a Scanner object for keyboard input.
        	//Note that here I used "Scanner in" instead of "Scanner input" this shows that you can use any of the two
        	//but remember that all your code needs to follow the one that you used.
      Scanner in = new Scanner (System.in); 
      
      //Prompt the user to enter celsius temperature
      System.out.print("Enter celsius temperature: ");
      
      double celsius = in.nextDouble ();
      	
      double fahrenheit = 9 *(celsius / 5)+32;
      
   
      //Fahrenheit
      System.out.println("Fahrenheit: " + fahrenheit);  
      
      in.close();
        }
        
     }

} 