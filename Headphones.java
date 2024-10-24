public class Headphones {

    static String brand;
    static String model;
    static int batteryLife; 

    String color;
    boolean isWireless;
    double weight; 
    int warrantyPeriod; 

    static {
        brand = "Sony";
        model = "WH-1000XM4";
        batteryLife = 30; 
    }

    public Headphones(String color, boolean isWireless, double weight, int warrantyPeriod) {
        this.color = color;
        this.isWireless = isWireless;
        this.weight = weight;
        this.warrantyPeriod = warrantyPeriod;
    }

    public void headphonesDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Life: " + batteryLife );
        System.out.println("Color: " + color);
        System.out.println("Wireless: " + isWireless );
        System.out.println("Weight: " + weight);
        System.out.println("Warranty Period: " + warrantyPeriod );
    }
}
