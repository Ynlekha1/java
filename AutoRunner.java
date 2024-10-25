public class AutoRunner{


public static void main(String args[])
{



	    Auto auto1 = new Auto(40, Auto.Type.PETROL, "ModelA", true);
        Auto auto2 = new Auto(35, Auto.Type.DIESEL, "ModelB", false);
        Auto auto3 = new Auto(50, Auto.Type.ELECTRIC, "ModelC", true);
        Auto auto4 = new Auto(45, Auto.Type.HYBRID, "ModelD", false);                 
        Auto auto5 = new Auto(60, Auto.Type.GAS, "ModelE", true);




        auto1.printDetails();
        auto2.printDetails();
        auto3.printDetails();
        auto4.printDetails();
        auto5.printDetails();
        

    }
}