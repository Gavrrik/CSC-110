package bankaccount10;

public class JaneBankAccount {
	private double balance;

	public void deposit(double amount) {
		balance += 500 + amount;
	}

	public void withdraw(double amount) {
		balance -= 500 - amount;

	}

	public double getBalance() {
		return balance;
	}

}
