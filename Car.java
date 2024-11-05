public class Car extends Vehicle{
	 int doors;

	public Car(String vehicleID,String model,String type,int speed,int doors)
	{
		super(vehicleID,model,type,speed);
		this.doors=doors;

    }

      public void displaycardetails()
      {
      	displayVehicleDetails();
      	System.out.println("total doors:"+ doors );
      }



}
