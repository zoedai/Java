package com.simbiosys.training.banking;

public class MyBankingApplication {

	public static void main(String[] args) {
		BankAccount checking = new CheckingAccount();
		BankAccount savings = new SavingsAccount();
		
		int bal = checking.debit(100, 10);
		System.out.println("Balance: " + bal);
		
		System.out.println("Balance: " + savings.credit(bal, 20));

	}

}
