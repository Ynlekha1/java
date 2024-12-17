package com.java.encapsulation;

public class Car {
	private String brand;
    private String model;
    private int year;
    private String color;
    private int price;

    public Car() {
        System.out.println("No argument constructor called.");
    }

    //set
    public void setBrand(String brand) {
    	this.brand = brand; 
    	}
    
    public void setModel(String model) {
    	this.model = model; 
    	}
    
    public void setYear(int year) { 
    	this.year = year; 
    	}
    
    public void setColor(String color) { 
    	this.color = color; 
   
    	}
    
    public void setPrice(int price) { 
    	this.price = price; 
    	}

    
    // get
    public String getBrand() { 
    	return brand; 
    	}
    
    
    public String getModel() { 
    	return model; 
    	}
    
    public int getYear() { 
    	return year;
    	}
    
    public String getColor() { 
    	return color; 
    	}
    
    public double getPrice() { 
    	return price;
    	}
    @Override
    public String toString() {
    	System.out.println("toString() invoke");
    	return this.brand+this.model+this.year+this.color+this.price;
    }
}


