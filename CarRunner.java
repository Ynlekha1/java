package com.java.encapsulation.movieRun;

import com.java.encapsulation.Car;

public class CarRunner {
	public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Toyota");
        System.out.println("Brand:" + car.getBrand());

        car.setModel("avalon");
        System.out.println("Model:" + car.getModel());

        car.setYear(2021);
        System.out.println("Year:" + car.getYear());

        car.setColor("White");
        System.out.println("Color:" + car.getColor());

        car.setPrice(250000);
        System.out.println("Price:" + car.getPrice());
        
        System.out.println(car);
    }
}


