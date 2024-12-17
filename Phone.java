package com.java.encapsulation;

public class Phone {
	private String brand;
	private String model;
    private int storage;
    private double price;
    private int batteryCapacity;

    public Phone() {
        System.out.println("No argument constructor called.");
    }

    // set
    public void setBrand(String brand) { 
    	this.brand = brand; 
    	}
    
    public void setModel(String model) { 
    	this.model = model; 
    	}
    
    public void setStorage(int storage) { 
    	this.storage = storage; 
    	}
    
    public void setPrice(double price) { 
    	this.price = price; 
    	}
    
    public void setBatteryCapacity(int batteryCapacity) { 
    	this.batteryCapacity = batteryCapacity; 
    	}
    

    // get
    public String getBrand() { 
    	return brand; 
    	}
    
    public String getModel() {
    	return model; 
    	}
    
    public int getStorage() { 
    	return storage; 
    	}
    
    public double getPrice() { 
    	return price; 
    	}
    
    public int getBatteryCapacity() { 
    	return batteryCapacity;
    	}
    
    @Override
    public String toString() {
    	System.out.println("toString() invoke");
    	return this.brand+this.model+this.storage+this.price+this.batteryCapacity;
}
}

