package com.simbiosys.training.banking;

interface BankAccount {
	public int debit(int currentBal, int debitAmount);
	public int credit(int currentBal, int creditAmount);

	
}
