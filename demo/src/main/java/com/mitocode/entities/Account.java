package com.mitocode.entities;

public class Account {
	
	//Encapsulamiento
	private int numer;
	private String holder;
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int numer, String holder) {
		super();
		this.numer = numer;
		this.holder = holder;
	}

	public Account(int numer, String holder, double initialDeposit) {
		super();
		this.numer = numer;
		this.holder = holder;
		this.deposit(initialDeposit);
	}

	public int getNumer() {
		return numer;
	}
	public void setNumer(int numer) {
		this.numer = numer;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Deposit
	public void deposit(double amount) {
		balance += amount;
	}
	
	//Withdraw
	public void withdraw(double amount) {
		balance -= amount*5.0;
	}
	
}
