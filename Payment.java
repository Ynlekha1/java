package com.java.methodoverriding.Payment;

public class Payment {
	
	String name;
	double amount;
	String transactionDate;
	
	public Payment(String name,double amount,String transactionDate)
	{
		this.name=name;
		this.amount=amount;
	    this.transactionDate=transactionDate;
	}
	
	public void processPayment()
	{
		System.out.println("processing a simple payment");
	}
	
	public void displayPaymentDetails()
	{
		System.out.println("payer name:"+name);
		System.out.println("amount is:"+amount);
		System.out.println("Transactiondate is:"+transactionDate);
		
	}

}
