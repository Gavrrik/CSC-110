import java.util.Scanner;


public class TemperatureConverter {

	public static void main(String[] args) {
		
		 //Create a Scanner object for keyboard input.
	      Scanner in = new Scanner (System.in);
	      
	      
	      
	    //Ask the user if he wants to convert
	      System.out.print("Type 1 to convert Fahrenheit to Celsius.\n");
	      System.out.print("Type 2 to convert Celsius to Fahrenheit.\n");
	      System.out.print("Type 3 to convert Kelvin to Celsius.\n");
	      System.out.print("Type 4 to convert Celsius to Kelvin.\n");
	      System.out.print("Type 5 to convert Kelvin to Fahrenheit.\n");
	      System.out.print("Type 6 to convert Fahrenheit to Kelvin.");
	      int choice = in.nextInt(); 
	      
	      //What did he or she choose?
	      if (choice==1) 
	      
	      { 
	    	  //Prompt the user to enter Fahrenheit temperature
	      
	      System.out.print("Enter fahrenheit temperature:");
	      
	      double fahrenheit = in.nextDouble ();
	      	
	      double celsius = 5 *(fahrenheit - 32)/9;
	      
	   
	      //Celsius
	      System.out.println("celsius:" + celsius);   
          
	      }
	      
	      if (choice==2) 
	      {
		      //Prompt the user to enter celsius temperature
		      System.out.print("Enter celsius temperature: ");
		      
		      double celsius = in.nextDouble ();
		      	
		      double fahrenheit = 9 *(celsius / 5)+32;
		      
		   
		      //Fahrenheit
		      System.out.println("Fahrenheit: " + fahrenheit);  
	    	  
	      }
	      
	      if (choice==3) 
	      {
		      //Prompt the user to enter Kelvin temperature
		      System.out.print("Enter Kelvin temperature: ");
		      
		      double kelvin = in.nextDouble ();
		      	
		      double celsius = kelvin - 273.0;
		      
		   
		      //Celsius
		      System.out.println("Celsius: " + celsius);  
	    	  
	      }
	      if (choice==4) 
	      {
		      //Prompt the user to enter celsius temperature
		      System.out.print("Enter celsius temperature: ");
		      
		      double celsius = in.nextDouble ();
		      	
		      double kelvin = celsius + 273.15F;
		      
		   
		      //Kelvin
		      System.out.println("Kelvin: " + kelvin);  
	    	  
	      }
	      if (choice==5)
	      {
		      //Prompt the user to enter Kelvin temperature
		      System.out.print("Enter kelvin temperature: ");
		      
		      double kelvin = in.nextDouble ();
		      	
		      double fahrenheit = ((kelvin - 273) * (9.0/5)) + 32;
		      
		   
		      //Fahrenheit
		      System.out.println("Fahrenheit: " + fahrenheit);  
	    	  
	      }
	      else
	      {
		      //Prompt the user to enter Fahrenheit temperature
		      System.out.print("Enter Fahrenheit temperature: ");
		      
		      double fahrenheit = in.nextDouble ();
		      	
		      double kelvin = (fahrenheit - 32) * (5.0/9) + 273;
		      
		   
		      //Kelvin
		      System.out.println("Kelvin: " + kelvin);  
	      
	      
	      in.close();
	  }

   }
	
}
