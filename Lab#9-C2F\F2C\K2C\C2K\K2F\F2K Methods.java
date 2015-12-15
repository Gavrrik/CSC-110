import java.util.Scanner;
import java.io.*;

public class TemperatureConverterMethods {
    
	 
    public static void main(String[] args) throws IOException
     {
    	
    //Scanner for keyboard input.
    Scanner in = new Scanner(System.in);
    //Input File path.
    File temperature = new File("/Users/Halcyon/Desktop/Eclipse Files/InputFile.txt");
    //Scanner for File input.
    Scanner inputFile = new Scanner(temperature);
    //Output File Path.
    PrintWriter outputFile = new PrintWriter("/Users/Halcyon/Desktop/Eclipse Files/OutputConversion.txt");
	
     	
      	double C, K, F; //Variables for temperature values: Celsius, Kelvin, Fahrenheit



    	 //Ask the user to choose a conversion formula

    	System.out.print("Type 1 to convert Fahrenheit to Celsius.\n");
    	System.out.print("Type 2 to convert Celsius to Fahrenheit.\n");
    	System.out.print("Type 3 to convert Kelvin to Celsius.\n");
    	System.out.print("Type 4 to convert Kelvin to Fahrenheit.\n");
    	System.out.print("Type 5 to convert Fahrenheit to Kelvin.\n");
    	System.out.print("Type 6 to convert Celsius to Kelvin.");
    	int choice = in.nextInt(); 

    	    	
    	 if (choice==1)
		{		
		outputFile.println("Fahrenheit"+"\t\t"+"Celsius");   	//table header
      		outputFile.println("___________________________");
      		
		while(inputFile.hasNext())
			{
        
           			String str = inputFile.nextLine();
            
				F = Double.parseDouble(str);
            			C = f2c(F);
  
            			outputFile.println(str+"\t\t"+C);   			//Temp. in/out two columns
        				System.out.println("Done!");
        		}
      	   	}
    	
   	else if (choice==2)
    		{		
		outputFile.println("Celsius"+"\t\t"+"Fahrenheit");   			//table header
      		outputFile.println("___________________________");
      		
		while(inputFile.hasNext())
			{
        
           			String str = inputFile.nextLine();
            
				C = Double.parseDouble(str);
            			F = c2f(C);

				outputFile.printf("%7.1f \t\t %7.1f", C,F);
				outputFile.println(""); 			//Temp. in/out two columns
				System.out.println("Done!");
        		}
      	   	}
	
   	else if (choice==3)
     	{
		outputFile.println("Kelvin"+"\t\t\t"+"Celsius");
		outputFile.println("________________________________");
      
      		while(inputFile.hasNext())
       		 {
			
           		String str = inputFile.nextLine();
           		K = Double.parseDouble(str);
     		   	C = k2c(K);
			outputFile.printf("%7.1f \t\t %7.1f", K,C);
			outputFile.println("");
			System.out.println("Done!");
   		 }
	}    
	else if (choice==4)
   	{
        	outputFile.println("Kelvin"+"\t\t\t"+"Fahrenheit");
   		outputFile.println("__________________________________");
      
     		while(inputFile.hasNext())
       		 {
        
           		String str = inputFile.nextLine();
            	K = Double.parseDouble(str);
			      F = k2f(K);
			      outputFile.printf("%7.1f \t\t %7.1f", K,F);
			      outputFile.println("");
					System.out.println("Done!");
		}
   	}
   	else if (choice==5)
   	{
		outputFile.println("Fahrenheit"+"\t\t\t"+"Kelvin");
  		outputFile.println("____________________________________");
      
      	while(inputFile.hasNext())
        	{
        
			   String str = inputFile.nextLine();
            F = Double.parseDouble(str);
			   K = f2k(F);
            outputFile.printf("%7.1f \t\t %7.1f", F,K);
            outputFile.println(""); 
			System.out.println("Done!");
        	}	
   	}
   	else if (choice==6)
   	{
		outputFile.println("Celsius"+"\t\t\t"+"Kelvin");
		outputFile.println("________________________________");
      
     		while(inputFile.hasNext())
      		{
        
           		String str = inputFile.nextLine();
            	
         		C = Double.parseDouble(str);
			      K = c2k(C);
              
            	outputFile.printf("%7.1f \t\t %7.1f", C,K);
           		outputFile.println("");
				System.out.println("Done!");
        	}
    	}
    in.close();
	inputFile.close();
	outputFile.close();     
	
	
   }

    
    
//methods
public static double f2c(double F)
{
	double C;
        C = 5.0/9*(F-32);
  	return C;  
                 
}
public static double c2f(double C)
{
	double F; 
        F = 9.0/5*C+32;
	return F;

}
public static double k2c(double K)
{
	double C;
	C= K-273;
	return C;
}
public static double k2f(double K)
{
	double F;
        F = K * 9/5 - 459.67;
	return F;
}
public static double f2k(double F)
{
 	double K;  
        K = (F + 459.67)*5/9;
 	return K;
}
public static double c2k(double C)
{
 	double K;
        K = C+273.15;
	return K;
}
//end of methods


}
