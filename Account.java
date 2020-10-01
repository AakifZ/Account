package edu.ben.assignments.assignment1;

/**
 * Account class has the features of a bank account like balance, withdrawal,
 * and depositing money
 * 
 * @author Aakif Ziauddin
 * @version 1.0
 */

public class Account {
	protected double balance;

	/**
	 * Creates the acconut and displays the current balance
	 * 
	 * @param balance sets a data field that shows the value as a double input
	 */

	public Account(double balance) {
		this.balance = balance;
	}

	/**
	 * Removes the x amount from the account's balance if the account has sufficient
	 * funds
	 * 
	 * @param amount is the amount that is being withdrawn from the account
	 */

	public void withdraw(double amount) {
		if (checkSufficientFunds(amount)) {
			balance -= amount;
		} else {
			throw new ArithmeticException();
		}
	}

	/**
	 * Adds the amount that user wants into the account balance
	 * 
	 * @param amount is the amount that is added into the account
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * Checks if the account balance has greater or equal to the amount that the
	 * user inputted
	 * 
	 * @param amount is being compared to the account balance
	 * @return returns true if the balance is greater or equal to the amount, return
	 *         false if the balance is less than the amount
	 */
	private boolean checkSufficientFunds(double amount) {
		return (balance >= amount);
	}

	/**
	 * Accesses the balance class and returns the balance's current amount
	 * 
	 * @return the balance of the account
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets the balance of the account according to the input
	 * 
	 * @param the balance after the user input
	 */
	private void setBalance(double balance) {
		this.balance = balance;
	}
}

/**
 * Extends the Account class and has everything the Account class has, but also
 * factors in interests rates
 * 
 * @author Aakif Ziauddin
 * @version 1.0
 *
 */
class SavingsAccount extends Account {

	double interestRate;

	/**
	 * Creates a savings account which takes in the balance and interest rate
	 * 
	 * @param balance      is the balance the account has in the beginning
	 * @param interestRate is the interest rate of the account
	 */
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	/**
	 * Shows the interest rate of the account
	 * 
	 * @return the interest rate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * Sets the interest rate that is inputted
	 * 
	 * @param interestRate is the value that is changing the account's interest rate
	 */
	private void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * Sets the savings account balance after being multiplied by the interest rate
	 */
	public void accrueInterest() {
		balance *= (1 + interestRate);
	}

}
