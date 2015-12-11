import java.util.Scanner;
import java.io.*;

public class TemptOut
{

    public static void main(String args[]) throws IOException
    {
    	//in Mac OS X  you can just type any name without the path and it will
    	//automatically save the file in the program folder 
    	//which is located inside the workspace folder. 
        String s = "/Users/Halcyon/Desktop/Eclipse Files/TempOut.txt";
        
        int inpval;
        int UserAnswer = 1;
        
        Scanner input = new Scanner (System.in);

        PrintWriter outputfile= new PrintWriter(s);

        
      do
        {
            System.out.println("please type a number");
        inpval = input.nextInt();
        outputfile.println(inpval);
        System.out.println("if you wany to continue tuype 1 otherwise type 2");
        UserAnswer = input.nextInt();
        }
      while (UserAnswer == 1);

        outputfile.println("Christ");
        outputfile.println("Katherin");
        outputfile.println("Jean");

        outputfile.close();

        System.out.println("Finish! the output file location is:"  + s);
        
        input.close();
    }
   
}
