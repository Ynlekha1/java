package com.java.encapsulation.movieRun;

import com.java.encapsulation.Book;

public class BookRunner {
	 public static void main(String[] args) {
	        Book book = new Book();
	        

	        book.setTitle("2 ststes");
	        System.out.println("Title: " + book.getTitle());

	        book.setAuthor("chethan bhagat");
	        System.out.println("Author: " + book.getAuthor());

	        book.setPages(200);
	        System.out.println("Pages: " + book.getPages());

	        book.setGenre("comedy");
	        System.out.println("Genre: " + book.getGenre());

	        book.setPrice(300);
	        System.out.println("Price: " + book.getPrice());
	        
	        System.out.println(book);
	       
	    }
	}


