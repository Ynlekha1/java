package com.java.TypeCasting;

public class CastingInheritance {
	public static void main(String[] args) {
		System.out.println("Upcasting in Inheritance");
		
		Vehicle vehicle = new Car();
		vehicle.start();
		
		
		
		Device device = new SmartPhone();
		device.powerOn();
		
		
		System.out.println("Downcasting in Inheritance:");
		
		Car car=(Car)vehicle;
		car.drive();
		
		SmartPhone phone = (SmartPhone) device;
		phone.makeCall(); 
		
		
		
	}

}
