package com.simbiosys.training.banking;

public class SavingsAccount implements BankAccount {

	@Override
	public int debit(int currentBal, int debitAmount) {
		return currentBal - debitAmount;
	}

	@Override
	public int credit(int currentBal, int creditAmount) {
		return currentBal + creditAmount + creditAmount / 10;
	}

}
