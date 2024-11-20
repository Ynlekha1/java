package com.java.crud;
import com.java.crud.Entity.Book;
import com.java.crud.Services.BookServices;
import com.java.crud.Services.BookServicesImpl;





public class BookRunner {
	public static void main(String[] args) {
		
		BookServices bookservices = new BookServicesImpl();
		Book book = new Book("emily in paris", "lekha", 120, 300, 10);
		
		
		
		bookservices.validateBook(book);
		
	}

}
