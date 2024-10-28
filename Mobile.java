public class Mobile{
	
  String brandname;
  int storage;
  int price;
  String color;
  String ram;

  public Mobile()
  {
  	System.out.println("no param");
  }

  public Mobile(String brandname)
  {
  	this();
  	this.brandname=brandname;
  }
  public Mobile(String brandname,int storage)
  {
  	this(brandname);
  	this.storage=storage;
  }

  public Mobile(String brandname,int storage,int price,String color)
  {
  	this(brandname,storage);
  	this.price=price;
  	this.color=color;
  }
public Mobile(String brandname,int storage,int price,String color,String ram)
  {
  	this(brandname,storage,price,color);
  	this.ram=ram;
  }



  public void MobileDetails()
  {
  	System.out.println("brand name is :"+brandname);
  	System.out.println("storage is:"+storage);
  	System.out.println("price is:"+price);
  	System.out.println("color is:"+color);
  	System.out.println("ram is:"+ram);

  }




}