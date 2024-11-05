public class ElectricCar extends Car
{

	int batteryCapacity;


	public ElectricCar(String vehicleID,String model,String type,int speed,int doors,int batteryCapacity)
	{
		super(vehicleID,model,type,speed,doors);
		this.batteryCapacity=batteryCapacity;


    }

		public void displayElectricCarDetails()
		{
			displayVehicleDetails();
			displaycardetails();
			System.out.println("battery capacity is :"+batteryCapacity);
		}
}

