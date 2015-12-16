import java.util.Scanner;

public class AccountDemo {
	
    public static void main(String[] args)
    {
    	
    //Create a Scanner object for keyboard input.
    Scanner in = new Scanner (System.in);
    //create a BankAccount object
    BillBankAccount Bill = new BillBankAccount();
    JaneBankAccount Jane = new JaneBankAccount();
    JohnBankAccount John = new JohnBankAccount();

   //Ask For user Authentication
    System.out.print("Type 1 - Bill.\n");
    System.out.print("Type 2 - Jane.\n");
    System.out.print("Type 3 - John.\n");
    int user = in.nextInt();

    
    if (user==1)
    	
    {
    
    	//Ask the user if he wants to deposit or  withdraw.
    	System.out.print("Type 1 to Deposit.\n");
    	System.out.print("Type 2 to Withdraw.\n");
        int decision = in.nextInt();

    
    	//What did he or she choose?
    	if (decision==1) 
    
    	{ 
    	//Ask how much money he wants to deposit
    	System.out.println("How much money do you want to deposit?");
        int billmoney = in.nextInt();
    	
        Bill.deposit (billmoney);

        //Display the balance
        System.out.println("Balance $" + Bill.getBalance() );
        }
    
    	if (decision==2) 
    	{

        //Ask how much money do he wants to withdraw
        System.out.println("How much money do you want to withdraw?");
        int billmoney = in.nextInt();
    	Bill.withdraw(billmoney);
    	
    	System.out.println("Balance $" + Bill.getBalance() );
    	}
    }
    
    if (user==2)
    	
    {
    
    	//Ask the user if he wants to deposit or  withdraw.
    	System.out.print("Type 1 to Deposit.\n");
    	System.out.print("Type 2 to Withdraw.\n");
        int decision = in.nextInt();

    
    	//What did he or she choose?
    	if (decision==1) 
    
    	{ 
       //Ask how much money he wants to deposit
    		
    	System.out.println("How much money do you want to deposit?");
    	int janemoney = in.nextInt();
    	
        Jane.deposit (janemoney);

        //Display the balance
        System.out.println("Balance $" + Jane.getBalance() );
        }
    
    	if (decision==2) 
    	{
    		
    	//Ask how much money do he wants to withdraw.
    	System.out.println("How much money do you want to withdraw?");
        int janemoney = in.nextInt();
    	Jane.withdraw(janemoney);
    	
    	System.out.println("Balance $" + Jane.getBalance() );
    	}
    }
    if (user==3)
    	
    {
    
    	//Ask the user if he wants to deposit or  withdraw.
    	System.out.print("Type 1 to Deposit.\n");
    	System.out.print("Type 2 to Withdraw.\n");
        int decision = in.nextInt();

    
    	//What did he or she choose?
    	if (decision==1) 
    
    	{ 
        //Ask how much money he wants to deposit
        System.out.println("How much money do you want to deposit?");
        int johnmoney = in.nextInt();
    	
        John.deposit (johnmoney);

        //Display the balance
        System.out.println("Balance $" + John.getBalance() );
        }
    
    	if (decision==2) 
    	{

    	//Ask how much money do he wants to withdraw.
    	System.out.println("How much money do you want to withdraw?");
        int johnmoney = in.nextInt();
    	John.withdraw(johnmoney);
    	
    	System.out.println("Balance $" + John.getBalance() );
    	}
    }
    in.close();
    }
}
 
