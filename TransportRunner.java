package com.java.abstraction;

public class TransportRunner {
	
	public static void main(String[] args) {
		
		
		Transport bus =new Bus();
		Transport train=new Train();
		Transport airplane=new Airplane();
		
		System.out.println("BUS");
		bus.Transportstart();
		bus.Transportstop();
		bus.ShowStatus();
		bus.fuelType();
		
		System.out.println("TRAIN");
		train.Transportstart();
		train.Transportstop();
		train.ShowStatus();
		train.fuelType();
		
		
		System.out.println("AIRPLANE");
		airplane.Transportstart();
		airplane.Transportstop();
		airplane.ShowStatus();
		airplane.fuelType();
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}
