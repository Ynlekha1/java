public class Train{
	  
	  String trainNumber;
	  String route;
	  int capacity;
	  int passengers;


	  public Train()
	  {
	  	System.out.println("no parmtzed constructor");
	  }

	  public Train(String trainNumber,String route,int capacity,int passengers)
	  {
         this.trainNumber = trainNumber;
         this.route = route;
         this.capacity = capacity;
         this.passengers = passengers;
	  }

	  public static void addPassengers()
	  {

	  }
	  public static void removePassengers()
	  {

	  }


	  public void displayTrainDetails() { // Changed to non-static
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Route: " + route);
        System.out.println("Capacity: " + capacity);
        System.out.println("Passengers: " + passengers);
    }
}

