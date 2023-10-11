package Oops;

	class BankAccount {
	    private String accountNumber;
	    private double balance;

	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0; // Default balance if the initial value is negative
	        }
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("12345", 1000.0);

	        // Access and modify data using encapsulation
	        System.out.println("Account Number: " + account.getAccountNumber());
	        System.out.println("Balance: " + account.getBalance());

	        // Deposit and withdraw funds
	        account.deposit(500.0);
	        account.withdraw(200.0);

	        System.out.println("New Balance: " + account.getBalance());
	    }
}
