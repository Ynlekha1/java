package com.java.acessspecifier;

public class BookRunner extends BookDetails {
	
	    
	    public BookRunner(int orderId, String customerName, int totalAmount) {
	        super(orderId, customerName, totalAmount);
	    }

	    public static void main(String[] args) {
	       
	        BookRunner runner = new BookRunner(001, "lekha", 250);
	        
	        runner.processOrder();
	        runner.updateStatus();
	        runner.calculateTotalAmount();
	    }

	    
	    public void processOrder() {
	        System.out.println("Processing order ID: " + orderId);
	        calculateTotalAmount();
	        updateStatus();
	        System.out.println("Order status updated for order ID: " + orderId);
	    }

	   
	    protected void calculateTotalAmount() {
	        System.out.println("Checking payment for the order: " + orderId + " with payment method for amount: " + totalAmount);
	    }

	   
	    void updateStatus() {
	        System.out.println("Updating order status....");
	    }
	}



