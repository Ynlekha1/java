package com.java.methodoverriding.Payment;

public class DebitCard extends Payment{
	
	String bankName;
	
	public DebitCard(String name,double amount,String transactionDate,String bankName)
	{
		super(name,amount,transactionDate);
		this.bankName=bankName;
	}

	
	@Override
	public void processPayment()
	{
		System.out.println("processing payment using Debit Card from " + bankName );
	}
	
	public void displayBankName()
	{
		System.out.println("bank name is:"+bankName);
		
	}
}
