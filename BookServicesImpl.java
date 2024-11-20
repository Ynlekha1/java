package com.java.crud.Services;

import com.java.crud.Entity.Book;



public class BookServicesImpl implements BookServices {

	@Override
	public boolean validateBook(Book book) {
		if(book!=null)
		{
			if(book.getTitle()!=null &&  book.getTitle().length()>3)
			{
				if(book.getAuthor()!=null && book.getAuthor().length()>3)
				{
					if(book.getPrice()>100)
					{
						if(book.getPages()>50)
						{
							if(book.getStock()>0) 
							{
								System.out.println("it is valid");
								return true;
							
							}System.err.println("stock shold be atleast 1");
							return false;
						
						}System.err.println("pages should be more than 50");
						return false;
					
					}System.err.println("price shold be greater than 100");
					return false;
				
				}System.err.println("author name should contain at least 3 characters");
				return false;
			
			}System.err.println("book title should contain at least 3 characters");
			return false;
		
		}System.err.println("Book cannot be null!");
        return false;
		
		
	}

}
