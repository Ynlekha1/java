package com.java.abstraction;

public class Train extends Transport {

	@Override
	public void Transportstart() {
		System.out.println("train get started");
		
	}

	@Override
	public void Transportstop() {
		System.out.println("train stopped");
		
	}

	@Override
	public void fuelType() {
		System.out.println("fuel type is:Electric");
		
	}
	
	
	
	

}
