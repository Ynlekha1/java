package com.java.methodoverriding;

import com.java.methodoverriding.Payment.CreditCard;
import com.java.methodoverriding.Payment.DebitCard;
import com.java.methodoverriding.Payment.Upi;

public class PaymentRunner {
	
	public static void main(String [] args)
	{
		CreditCard credit = new CreditCard("lekha", 140.65, "06-10-2024", "1234567812");
		credit.displayPaymentDetails();
		credit.processPayment();
		credit.displayCardType();
		
		
		DebitCard debit= new DebitCard("thashwini", 256.83, "05-10-2024", "HDFC");
		debit.displayPaymentDetails();
		debit.processPayment();
		debit.displayBankName();
		
		
		Upi upi = new Upi("sameeksha", 523.98, "04-10-2024","sam@okhdfcbank");
		upi.displayPaymentDetails();
		upi.processPayment();
		upi.displayID();
		
		
	}
	
        
}
