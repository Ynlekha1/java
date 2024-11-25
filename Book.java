package com.java.exceptions;

public class Book {
	public static void main(String[] args) {
		
		String bookTitle = null;
		
		String Author = "YN Lekha";
		
		
		
	if(bookTitle!=null)
	{
		System.out.println("book title is" +bookTitle);
		System.out.println("title length" +bookTitle.length());
	}else
	{
		System.err.println("book titl is not available");
	}
	
	
	
	if(Author!=null)
	{
		System.out.println(Author);
		System.out.println("author length:" +Author.length());
	}else
	{
		System.err.println("author name is missing");
	}
		
		
		
		
	}

}
