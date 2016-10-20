package projects;
import java.util.Scanner;

// Lab#5-C2F\F2C\K2C\C2K\K2F\F2K Loop
public class TemperatureConverterWhileLoop5 {

	public static void main(String[] args) {
		
		 //Create a Scanner object for keyboard input.
	      Scanner input = new Scanner (System.in);
	      int i =8;
	      
	      do{
	      
	    //Ask the user if he wants to convert
		      System.out.print("Type 1 to convert Fahrenheit to Celsius.\n");
		      System.out.print("Type 2 to convert Celsius to Fahrenheit.\n");
		      System.out.print("Type 3 to convert Kelvin to Celsius.\n");
		      System.out.print("Type 4 to convert Celsius to Kelvin.\n");
		      System.out.print("Type 5 to convert Kelvin to Fahrenheit.\n");
		      System.out.print("Type 6 to convert Fahrenheit to Kelvin.");
	      int choice = input.nextInt(); 
	      
	      //What did he or she choose?
	      if (choice==1)
	      
	      { 
	    	  //Prompt the user to enter Fahrenheit temperature
		      
	      System.out.print("Enter fahrenheit temperature:");
	      
	      double fahrenheit = input.nextDouble ();
	      	
	      double celsius = 5 *(fahrenheit - 32)/9;
	      
	   
	      //Celsius
	      System.out.println("celsius:" + celsius);   
	      
	      System.out.println( "If You want to continue type  8, otherwise type 9");
          i = input.nextInt();
          
	      }
	      if (choice==2) 
	      {
		      //Prompt the user to enter celsius temperature
		      System.out.print("Enter celsius temperature: ");
		      
		      double celsius = input.nextDouble ();
		      	
		      double fahrenheit = 9 *(celsius / 5)+32;
		      
		   
		      //Fahrenheit
		      System.out.println("Fahrenheit: " + fahrenheit);
		      System.out.println( "If You want to continue type  8, otherwise type 9");
	          i = input.nextInt();
	    	  
	      }
	      
	      if (choice==3) 
	      {
		      //Prompt the user to enter Kelvin temperature
		      System.out.print("Enter Kelvin temperature: ");
		      
		      double kelvin = input.nextDouble ();
		      	
		      double celsius = kelvin - 273.0;
		      
		   
		      //Celsius
		      System.out.println("Celsius: " + celsius);
		      System.out.println( "If You want to continue type  8, otherwise type 9");
	          i = input.nextInt();
	    	  
	      }
	      if (choice==4) 
	      {
		      //Prompt the user to enter celsius temperature
		      System.out.print("Enter celsius temperature: ");
		      
		      double celsius = input.nextDouble ();
		      	
		      double kelvin = celsius + 273.15F;
		      
		   
		      //Kelvin
		      System.out.println("Kelvin: " + kelvin);  
		      System.out.println( "If You want to continue type  8, otherwise type 9");
	          i = input.nextInt();
	    	  
	      }
	      if (choice==5)
	      {
		      //Prompt the user to enter Kelvin temperature
		      System.out.print("Enter kelvin temperature: ");
		      
		      double kelvin = input.nextDouble ();
		      	
		      double fahrenheit = ((kelvin - 273) * (9.0/5)) + 32;
		      
		   
		      //Fahrenheit
		      System.out.println("Fahrenheit: " + fahrenheit);  
		      System.out.println( "If You want to continue type  8, otherwise type 9");
	          i = input.nextInt();
	    	  
	      }
	      else
	      {
	      
		      //Prompt the user to enter Fahrenheit temperature
		      System.out.print("Enter Fahrenheit temperature: ");
		      
		      double fahrenheit = input.nextDouble ();
		      	
		      double kelvin = (fahrenheit - 32) * (5.0/9) + 273;
		      
		   
		      //Kelvin
		      System.out.println("Kelvin: " + kelvin); 
		      System.out.println( "If You want to continue type  8, otherwise type 9");
	          i = input.nextInt();
          
	          }
	      }while ( i < 9);
	      input.close();
	}

}
