public class ChairRunner{


public static void main(String args[])
{
	    Chair chair1 = new Chair("Ikea", 90, "Recliner", true);
        Chair chair2 = new Chair("Urban Ladder", 85, "Dining", false);
        Chair chair3 = new Chair("HomeTown", 100, "Office", true);
        Chair chair4 = new Chair("Godrej", 80, "Folding", false);
        Chair chair5 = new Chair("Pepperfry", 75, "Gaming", true);



        chair1.chairDetails();
        chair2.chairDetails();
        chair3.chairDetails();
        chair4.chairDetails();
        chair5.chairDetails();
        

}
}