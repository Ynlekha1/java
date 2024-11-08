package com.java.acessspecifier;

public class BookDetails {
	
	    
	    protected int orderId;
	    public String customerName;
	    private String orderDate;
	    int totalAmount;

	   
	    public BookDetails(int orderId, String customerName, int totalAmount) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.totalAmount = totalAmount;
	    }

	  
	    BookDetails(String orderDate) {
	        this.orderDate = orderDate;
	    }

	   
	    public void printDetails() {
	        System.out.println("The order ID is: " + orderId);
	        System.out.println("The customer name is: " + customerName);
	        System.out.println("The order date is: " + orderDate);
	        System.out.println("The total amount is: " + totalAmount);
	    }
	}


