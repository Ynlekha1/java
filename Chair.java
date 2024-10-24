public class Chair{


	static String material;
    static int legs;
    static String color;
    
    String brand;
    int height;
    String type;
    boolean hasCushion;

static{
	material="wood";
	legs=4;
	color="brown";
}


public Chair(String brand,int height,String type,boolean hasCushion)
{
	this.brand=brand;
	this.height=height;
	this.type=type;
	this.hasCushion=hasCushion;
}
public void chairDetails()
{
System.out.println(material);
System.out.println(legs);
System.out.println(color);
System.out.println(brand);
System.out.println(height);
System.out.println(type);
System.out.println(hasCushion);

}
}