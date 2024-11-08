package com.java.acessspecifier1;

import com.java.acessspecifier1.book.BookDetails1;

public class BookRunner1 extends BookDetails1{
	
		
		    
		    public BookRunner1(int orderId, String customerName, int totalAmount) {
		        super(orderId, customerName, totalAmount);
		    }

		    public static void main(String[] args) {
		       
		        BookRunner1 runner = new BookRunner1(001, "lekha", 250);
		        
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
		        
				System.out.println("Checking payment for the order: " + orderId + "  book delivered to customer: " + customerName);
		    }

		   
		      void updateStatus() {
		        System.out.println("Updating order status....");
		    }
		}






