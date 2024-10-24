public class BatRunner{
	public static void main(String args [])
	{
		ShuttleBat bat1 = new ShuttleBat("lekha", 66, ShuttleBat.GripType.COMFORT, true);
        ShuttleBat bat2 = new ShuttleBat("indrajeeth", 68, ShuttleBat.GripType.STANDARD, false);
        ShuttleBat bat3 = new ShuttleBat("bharath", 65, ShuttleBat.GripType.TACKY, true);
        ShuttleBat bat4 = new ShuttleBat("teju", 67, ShuttleBat.GripType.SOFT, true);
        ShuttleBat bat5 = new ShuttleBat("vaibhav", 70, ShuttleBat.GripType.HARD, false);




        bat1.printbatDetails();
        bat2.printbatDetails();
        bat3.printbatDetails();
        bat4.printbatDetails();
        bat5.printbatDetails();
	}
}