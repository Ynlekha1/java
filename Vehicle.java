public class Vehicle{
	String vehicleID;
	String model;
	String type;
	int speed;


public Vehicle(String vehicleID,String model,String type,int speed)
{
	this.vehicleID=vehicleID;
	this.model=model;
	this.type=type;
	this.speed=speed;
}


public void displayVehicleDetails()
{
	    System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed );
}
}