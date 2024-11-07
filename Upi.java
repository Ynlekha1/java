package com.java.methodoverriding.Payment;

public class Upi extends Payment{
	
	String upiId;
	
	public Upi(String name,double amount,String transactionDate,String upiId)
	{
		super(name,amount,transactionDate);
		this.upiId=upiId;
	}
	
	@Override
	public void processPayment()
	{
		System.out.println("upi id is:"+upiId);
		
	}
	
	public void displayID()
	{
		System.out.println("UPI:"+upiId);
	}

}
