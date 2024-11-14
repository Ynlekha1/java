package com.java.abstraction;

public class Bus extends Transport {
	
	@Override
	public  void  Transportstart() {
		System.out.println("Bus is starting");
	}
	
	@Override
	public  void  Transportstop() {
		System.out.println("bus got stopped");
	}


	@Override
	public void fuelType() {
		System.out.println("fuel type is: diesel");
		
	}
	
	
	
	

}
