package edu.ben.assignments.assignment1.test;

import org.junit.Test;

import student.TestCase;

import edu.ben.assignments.assignment1.Account;

public class AccountTest extends TestCase {

	Account acct;

	public void setUp() {
		acct = new Account(43698);
	}

	@Test 
	public void testWithdraw() {
		acct.withdraw(698);
		assertEquals(43000, acct.getBalance(), 0);
	}

	@Test(expected = ArithmeticException.class)
	public void testWithdrawElse() {
		acct.withdraw(44000);
	}

	@Test
	public void testDeposit() {
		acct.deposit(302);
		assertEquals(44000, acct.getBalance(), 0);
	}
}
