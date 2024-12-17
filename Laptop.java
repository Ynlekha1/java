package com.java.encapsulation;

public class Laptop {
	private String brand;
    private String processor;
    private int ram;
    private int storage;
    private double price;

    public Laptop() {
        System.out.println("No argument constructor called.");
    }

    // set
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // get
    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        System.out.println("toString() invoked");
        return this.brand+this.processor+this.ram+this.storage+this.price;
    }
}

