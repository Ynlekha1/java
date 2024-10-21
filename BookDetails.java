public class BookDetails{

	static Book[]bookData = new Book[10];


	public static void main (String [] args)
	{
		Book book = new Book("Midnight's Children","Salman Rushdie",536,1986);
		Book book1 = new Book("2 States","Chetan bhagat",100,2009);
		Book book2 = new Book("The God of Small Things","Arundhati Roy",200,1987);
		Book book3 = new Book("A Fine Balance","Rohinton Mistry",170,2000);
		Book book4 = new Book("The White Tiger","Aravind Adiga",180,2010);
		Book book5 = new Book("The Inheritance of Loss","Kiran Desai",500,1999);
		Book book6 = new Book("The Namesake","Jhumpa Lahiri",450,2007);
		Book book7 = new Book("Shantaram","Gregory David Roberts",470,1998);


         saveBook(book);
         saveBook(book1);
         saveBook(book2);
         saveBook(book3);
         saveBook(book4);
         saveBook(book5);
         saveBook(book6);
         saveBook(book7);


        System.out.println("  to display book details");
		for(int i=0;i<bookData.length;i++)
		{
			if(bookData[i]!=null)
			{
				bookData[i].BookDetails();
			}
		}

		

        System.out.println("-------------  find Book--------------");
        Book foundTitle = findbybooktitle("2 States");
        Book foundTitle1 = findbybooktitle("A Fine Balance");
        if (foundTitle != null) 
        {
            foundTitle.BookDetails();
            foundTitle1.BookDetails();
        }



        System.out.println("-----------Update Book Pages------------");
        updatebookbypages("2 States", 120);
        updatebookbypages("The White Tiger", 200);
	    System.out.println("Updated Book Details");
        for (int i = 0; i < bookData.length; i++) 
        {
            if (bookData[i] != null)
             {
                bookData[i].BookDetails();
            }
        }
    }

	public static boolean saveBook(Book book)
	{
		for(int i = 0;i<bookData.length;i++)
		{
			if(bookData[i]==null)
			{
				bookData[i]= book;
				System.out.println("book is saved");
				return true;
			}
			
		}

		System.out.println("No space in the array");
            return false;
	}


	public static Book findbybooktitle(String title )
	{
		for(int i = 0;i< bookData.length;i++)
		{
			if(bookData[i]!=null)
			{
              if(bookData[i].title.equals(title))
              {
                System.out.println("book found");
                return bookData[i]; 
              }

			}

		}
	        System.out.println("book  not found");
	        return null;
	}

	public static boolean updatebookbypages(String title,int pages)
	{
		for(int i =0;i <bookData.length;i++)
		{
			if(bookData[i]!=null)
			{
				if(bookData[i].title.equals(title))
				{
					bookData[i].pages=(pages);
					System.out.println("updated pages");
					return true;

				}
			}
		}
		System.out.println("not updated");
    	return false;
	}
}