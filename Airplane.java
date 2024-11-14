package com.java.abstraction;

public class Airplane extends Transport{

	@Override
	public void Transportstart() {
		System.out.println("Airplane is taking off");
		
	}

	@Override
	public void Transportstop() {
		System.out.println("Airplane is landing");
		
	}

	@Override
	public void fuelType() {
		System.out.println("fuel type:jet fuel");
		
	}

}
