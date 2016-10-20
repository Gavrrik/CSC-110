package bankaccount10;

public class BillBankAccount {
    private double balance;

    public void deposit (double amount)
    {

    balance += 1000 + amount;
    
    }
    public void withdraw (double amount)
    {

    balance -= 1000 - amount;
    
    } 
    public double getBalance()
    {
    return balance;
    }

}
