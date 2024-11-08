package com.java.acessspecifier;

public class BookOrder extends BookRunner{
	
	    public String deliveryAddress; 

	   
	    private BookOrder(int orderId, String customerName, int totalAmount, String deliveryAddress) {
	        super(orderId, customerName, totalAmount);
	        this.deliveryAddress = deliveryAddress;
	    }

	    @Override
	    public void processOrder() {
	        System.out.println("Processing book order ID: " + orderId);
	        verifyDeliveryAddress();
	        System.out.println("Order status updated to: " + customerName);
	    }

	    private void verifyDeliveryAddress() {
	        System.out.println("Verifying delivery address: " + deliveryAddress);
	    }
	}



