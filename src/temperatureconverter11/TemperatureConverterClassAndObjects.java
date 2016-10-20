package temperatureconverter11;

import java.util.Scanner;

public class TemperatureConverterClassAndObjects {

public static void main(String[] args)
{      
// Declare variable for user input
   double degrees;
      
// Declare and create two Temperature objects
   TemperatureMethods Calculations = new TemperatureMethods();
      
// Create a Scanner object to read from the keyboard
   Scanner keyboard = new Scanner(System.in);
	 //Create a Scanner object for keyboard input.a
   Scanner input = new Scanner (System.in);
   
//Ask the user if he wants to convert
   System.out.print("Type 1 to convert Fahrenheit Temperature.\n");
   System.out.print("Type 2 to convert Celsius Temperature.\n");
   System.out.print("Type 3 to convert Kelvin Temperature.\n");
int choice = input.nextInt(); 

//What did he or she choose?
if (choice==1)
	
{

   System.out.print("Enter a temperature in Fahrenheit: ");
   degrees = keyboard.nextDouble();
   
   Calculations.DegreesToFahrenheit(degrees);
   Calculations.FahrenheitDegreesToCelsius(degrees); 
   Calculations.DegreesToKelvin(degrees);
   
// Display the temperature in all three scales
   System.out.println("Fahrenhiet " + degrees );
   System.out.println("Celsius " + Calculations.getCelsius() );
   System.out.println("Kelvin " + Calculations.getKelvin() );
   
}

if (choice==2)
	
{
	
	System.out.print("Enter a temperature in Celsius: ");
	degrees = keyboard.nextDouble();  
	
	Calculations.DegreesToFahrenheit(degrees);
	Calculations.DegreesToCelsius(degrees); 
	Calculations.CelsiusDegreesToKelvin(degrees);
	   
// Display the temperature in all three scales
	System.out.println("Fahrenhiet " + Calculations.getCelsius() );
	System.out.println("Celsius " + degrees );
	System.out.println("Kelvin " + Calculations.getKelvin() );
   
}

if (choice==3)
	
{
	
	System.out.print("Enter a temperature in Kelvin: ");
	degrees = keyboard.nextDouble();
	
	Calculations.KelvinDegreesToFahrenheit(degrees);
	Calculations.KelvinDegreesToCelsius(degrees); 
	Calculations.DegreesToKelvin(degrees);
	   
// Display the temperature in all three scales
	System.out.println("Fahrenhiet " + Calculations.getFahrenheit() );
	System.out.println("Celsius " + Calculations.getCelsius() );
	System.out.println("Kelvin " + degrees );
   
}
keyboard.close();
input.close();
}

}
