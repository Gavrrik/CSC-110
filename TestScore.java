import java.util.Scanner;

public class TestScore
{ 
   public static void main(String[] args) 
   { 
     
	  int testScore;
	  
	     //Create a Scanner object for keyboard input.
		 Scanner keyboard = new Scanner (System.in);
		 
		 //Get a Test Score
		 System.out.print("Enter your test Score:");
		 testScore = keyboard.nextInt();
		 
		 //Was the score a good one.
		 if (testScore > 90)
			 
			 {
				 System.out.println("That's a great score!:");
				 System.out.println("Keep up the good work.");
				 
			 } 
		 keyboard.close(); 	 
   }
   
   
}
   