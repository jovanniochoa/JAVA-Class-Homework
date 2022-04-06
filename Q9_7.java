import java.util.*;
//This program get the annual interest rate, id, balance, and 
//returns the monthly interest rate, account balance, and the date the account
//was created
/*                     Account                           
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 -id: int
 -balance: double
 -annualInterestRate: double
 -dateCreated: String
 +Account()
 +Account(tempid: int, tempBalance: double)
 +setId(tempId: int)
 +setBalance(tempBalance: double)
 +setAnnualInterestRate(tempAnnualInterestRate: double)
 +getId(): int
 +getBalance(): double                                
 +getAnnualInterestRate(): double
 +getDateCreated(): String
 +getMonthlyInterestRate(): double
 +getMonthlyInterest(): double
 +withdraw(amount: double)
 +deposit(amount: double)
 */
public class Q9_7 {

	public static void main(String[] args) {
		//creates an account with an id and balance
		Account account = new Account(1122, 20000);

		//declares the annual interest rate, withdraw, and deposit
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);

		//prints out id, date made, balance, and monthly interest
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
	}
}



class Account {
	//sets data field
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	//no args account
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	//makes an account
	Account(int tempId, double tempBalance) {
		id = tempId;
		balance = tempBalance;
		dateCreated = new Date();
	}

	//mutator for id
	public void setId(int tempId) {
		id = tempId;
	}

	//mutator for balance
	public void setBalance(double tempBalance) {
		balance = tempBalance;
	}

	//mutator for annual interest rate
	public void setAnnualInterestRate(double tempAnnualInterestRate) {
		annualInterestRate = tempAnnualInterestRate;
	}

	//accessor for id
	public int getId() {
		return id;
	}

	//accessor for balance
	public double getBalance() {
		return balance;
	}

	// accessor for annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	//accessor for date created
	public String getDateCreated() {
		return dateCreated.toString();
	}

	//method for monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	//method for monthly interest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	//method withdraw
	public void withdraw(double amount) {
		balance -= amount;
	}

	//method deposit
	public void deposit(double amount) {
		balance += amount;
	}
}