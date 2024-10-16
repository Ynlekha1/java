public class Book {
	
    String title;
    String author;
    int pages;
    int publicationYear;


    public Book()
    {
    	System.out.println("no parmeterized constructor");
    }

    public Book (String title,String author,int pages,int publicationYear)
    {
    	this.title = title;
    	this.author = author;
    	this.pages = pages;
    	this.publicationYear = publicationYear;
    }

    public void BookDetails()
    {
    	System.out.println("Title : " + title);
    	System.out.println("Author : " + author);
    	System.out.println("Pages : " + pages);
    	System.out.println("Publication Year : " + publicationYear);
    	System.out.println();
    }
}