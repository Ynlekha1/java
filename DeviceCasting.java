package com.java.exceptions;

public class DeviceCasting {
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		
		//up
		Object obj = laptop;
		
		if(obj instanceof Laptop)
		{
			//down
			Laptop downcastedLaptop = (Laptop)obj;
			
			downcastedLaptop.Code();
			downcastedLaptop.Turnon();
		}
		else
		{
			System.out.println("object is not of type Laptop");
		}
		
		//down
		if (obj instanceof ElectronicDevice) 
		{
            ElectronicDevice downcastedDevice = (ElectronicDevice) obj; 
            downcastedDevice.Turnon(); 
            
		}
	}

}
