public class Text{
	public static void main(String [] args)
	{
      readbook("Emily in Paris");
      readbook("Emily in Paris",140);
      readbook(140,"Emily in Paris");

      recordbook(575015);
      recordbook(575025,"Drama");
      recordbook("Emily in Paris",6);

      summary(99);
      summary("library",5654);
      summary(65342,"Darren Star");
	}

	
	public static void readbook (String name)
	{
		System.out.println("book title :" + name );
	}
    public static void readbook (String name,int pages)
    {
    	System.out.println("book title :" + name );
    	System.out.println("no:of pages :" + pages );
    }
    public static void readbook (int pages,String name)
    {
    	System.out.println("pages :" + pages);
    	System.out.println("book title :" + name );
    }



    public static void recordbook (int bookID)
    {
    	System.out.println("Book ID :" + bookID);
    }
    public static void recordbook(int bookID,String category)
    {
    	System.out.println("Book ID:" + bookID);
    	System.out.println("Category : "+ category);
    }
    public static void recordbook(String name,int bookID)
    {
    	System.out.println("title:" + name);
    	System.out.println("Book ID:" + bookID);
    }


    public static void summary(int summaryID)
    {
    	System.out.println("summary ID is :"+summaryID);
    }
    public static void summary(String location, int bookID)
    {
    	System.out.println("location is :"+ location);
    	System.out.println("Book ID:" + bookID);
    }
    public static void summary(int bookID,String publisher )
    {
    	System.out.println("Book ID:" + bookID);
    	System.out.println("publisher name is:" +publisher);
    }
}