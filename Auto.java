public class Auto{

     public enum Type {
        PETROL, DIESEL, ELECTRIC, HYBRID, GAS
    }

     static int wheels;
     static String brandname;
     static int seats;
     int milage;
     Type type;
     String model;
     boolean hasGPS;
     


     static{
     	wheels = 3;
     	brandname = "Bajaj";
     	seats = 4;
     }


     public Auto(int milage,Type type,String model,boolean hasGPS)
     {
     	
     	this.milage=milage;
     	this.type=type;
     	this.model=model;
     	this.hasGPS=hasGPS;
     }


     public void printDetails()
     {
     	System.out.println(wheels);
     	System.out.println(brandname);
     	System.out.println(seats);
     	System.out.println(milage);
     	System.out.println(type);
     	System.out.println(model);
     	System.out.println(hasGPS);

     }


}