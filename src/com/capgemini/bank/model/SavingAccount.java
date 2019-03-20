package com.capgemini.bank.model;

public class SavingAccount {
	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalaryAccount;
	private static double MIN_BALANCE = 1000;
	public SavingAccount() {
		
	}
	public SavingAccount(int accountId, String accountHolderName, double accountBalance, boolean isSalaryAccount) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public double withdraw(double amount)
	{
		if(!(isSalaryAccount))
		{
			if(accountBalance-amount>=MIN_BALANCE)
			{
				accountBalance = accountBalance - amount;
				return accountBalance;
			}
			else
				return accountBalance;
		}
		else
		{
			accountBalance = accountBalance - amount;
			return accountBalance;
		}
	}
	
	public double deposit(double amount)
	{
		accountBalance = accountBalance + amount;
		return accountBalance;
	}
	
}
