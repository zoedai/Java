package com.simbiosys.training.banking;

public class CheckingAccount implements BankAccount {

	@Override
	public int debit(int currentBal, int debitAmount) {
		return currentBal - debitAmount;
	}

	@Override
	public int credit(int currentBal, int creditAmount) {
		return currentBal + creditAmount;
	}

}
