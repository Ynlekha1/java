public class ShuttleBat{


public enum GripType {
	COMFORT,STANDARD,TACKY,SOFT,HARD
}





	static String brand;
    static String material;
    static double weight;
    String playerName;
    int length; 
    GripType grip;
    boolean isLightweight;

  static{
  	brand="yonex";
  	material="wood";
  	weight=200;
}

    public ShuttleBat(String playerName,int length,GripType grip,boolean isLightweight)
    {
    	this.playerName=playerName;
     	this.length=length;
    	this.grip=grip;
    	this.isLightweight=isLightweight;
    }

    public void printbatDetails()
    {
    System.out.println(brand);
    System.out.println(material);
    System.out.println(weight);
    System.out.println(playerName);
    System.out.println(length);
    System.out.println(grip);
    System.out.println(isLightweight);
}

}