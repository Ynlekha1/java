package com.java.methodoverriding.Payment;

public class CreditCard extends Payment{
	
	String cardNumber;
	
	public CreditCard(String name,double amount,String transactionDate,String cardNumber)
	{
		super(name,amount,transactionDate);
		this.cardNumber=cardNumber;
	}
	
	
    @Override
	public void processPayment()
	{
		System.out.println("Processing payment using Credit Card ending with:"+cardNumber.substring(6)+"...");
	}
	
    public void displayCardType() 
    {
        System.out.println("This is a Credit Card transaction");
    }

}
