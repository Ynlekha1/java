public class HeadRunner{


public static void main(String args[])
{
	    Headphones headphones1 = new Headphones("Black", true, 0.25, 24);
        Headphones headphones2 = new Headphones("White", true, 0.30, 12);
        Headphones headphones3 = new Headphones("Red", false, 0.35, 18);
        Headphones headphones4 = new Headphones("Blue", true, 0.28, 36);
        Headphones headphones5 = new Headphones("Green", false, 0.40, 12);



        headphones1.headphonesDetails();
        headphones2.headphonesDetails();
        headphones3.headphonesDetails();
        headphones4.headphonesDetails();
        headphones5.headphonesDetails();
}
}