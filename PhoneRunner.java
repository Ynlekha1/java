package com.java.encapsulation.movieRun;

import com.java.encapsulation.Phone;

public class PhoneRunner {
	public static void main(String[] args) {
       Phone phone = new Phone();

        phone.setBrand("oneplus");
        System.out.println("Brand: " + phone.getBrand());

        phone.setModel("nord ce4");
        System.out.println("Model: " + phone.getModel());

        phone.setStorage(256);
        System.out.println("Storage: " + phone.getStorage() + " GB");

        phone.setPrice(25000);
        System.out.println("Price: " + phone.getPrice());

        phone.setBatteryCapacity(5000);
        System.out.println("Battery Capacity: " + phone.getBatteryCapacity() );
        
        System.out.println(phone);
    }
}


