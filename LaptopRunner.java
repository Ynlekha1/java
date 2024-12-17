package com.java.encapsulation.movieRun;

import com.java.encapsulation.Laptop;

public class LaptopRunner {
	public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setBrand("Apple");
        System.out.println("Brand: " + laptop.getBrand());

        laptop.setProcessor("M1 Pro");
        System.out.println("Processor: " + laptop.getProcessor());

        laptop.setRam(16);
        System.out.println("RAM: " + laptop.getRam() );

        laptop.setStorage(512);
        System.out.println("Storage: " + laptop.getStorage() );

        laptop.setPrice(1999.99);
        System.out.println("Price" + laptop.getPrice());

        System.out.println(laptop);

}
}
