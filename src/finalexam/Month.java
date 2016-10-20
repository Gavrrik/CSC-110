package finalexam;


import java.util.Scanner;


public class Month 
{ 
   public static void main(String[] args) 
   { 
     
	 
	  
	     //Create a Scanner object for keyboard input.
	   Scanner input = new Scanner (System.in);
		 
		 //Get month number
		 System.out.print("Enter a month as an integer 1-12:");
		 int choice = input.nextInt();
		  int number = 12;
		 

		 if (choice == 12)
			 
			 {
				 System.out.println("WINTER MONTH");	 
			 }
		 if (choice == 1)
			 
		 {
			 System.out.println("WINTER MONTH");	 
		 }
		 if (choice == 2)
			 
		 {
			 System.out.println("WINTER MONTH");	 
		 }
		 if (choice == 3)
			 
		 {
			 System.out.println("SPRING MONTH");	 
		 }
		 if (choice == 4)
			 
		 {
			 System.out.println("SPRING MONTH");	 
		 }
		 if (choice == 5)
			 
		 {
			 System.out.println("SPRING MONTH");	 
		 }
		 if (choice == 6)
				 
			 {
				 System.out.println("SUMMER MONTH");	 
			 }
		 if (choice == 7)
			 
		 {
			 System.out.println("SUMMER MONTH");	 
		 }
		 if (choice == 8)
			 
		 {
			 System.out.println("SUMMER MONTH");	 
		 }
		 if (choice == 9)
			 
		 {
			 System.out.println("FALL MONTH");	 
		 }
		 if (choice == 10)
			 
		 {
			 System.out.println("FALL MONTH");	 
		 }
		 if (choice == 11)
			 
		 {
			 System.out.println("FALL MONTH");	 
		 }
			 
		 if (choice > number)
        {
			System.out.println("INVALID NUMBER");
						
		}

		  input.close();	 
   }
   
   
}
