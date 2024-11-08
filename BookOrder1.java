package com.java.acessspecifier1.book;

import com.java.acessspecifier1.BookRunner1;

public class BookOrder1 extends BookRunner1{
	
		
		    public String deliveryAddress; 

		   
		    private BookOrder1(int orderId, String customerName, int totalAmount, String deliveryAddress) {
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






