public class VehicleApp
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = new Vehicle("v001", "Civic", "Sedan", 180);
		Car car=new Car("v002", "Mustang", "Sports", 250,2);
		ElectricCar electricCar= new ElectricCar("v003", "Tesla Model S", "Electric", 300, 4,80);



		vehicle.displayVehicleDetails();
		car.displaycardetails();
		electricCar.displayElectricCarDetails();
	}
	
}