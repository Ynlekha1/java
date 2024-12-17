package com.java.encapsulation;

public class Book {
	
	private String title;
    private String author;
    private int pages;
    private String genre;
    private int price;

    public Book() {
        System.out.println("No argument");
    }

    // Setters
    public void setTitle(String title){ 
    	this.title = title;
    	}
    
    public void setAuthor(String author){ 
    	this.author = author; 
    	}
    
    public void setPages(int pages){ 
    	this.pages = pages; 
    	}
    
    public void setGenre(String genre){
    	this.genre = genre;
    	}
    
    public void setPrice(int price){
    	this.price = price; 
    	}

    // get
    public String getTitle(){
    	return title; 
    	}
    
    public String getAuthor(){ 
    	return author; 
    	}
    
    public int getPages(){ 
    	return pages; 
    	}
    
    public String getGenre(){
    	return genre; 
    	}
    
    public double getPrice(){ 
    	return price; 
    	}
    @Override
    public String toString() {
    	System.out.println("toString() invoke");
    	return this.title+this.author+this.pages+this.genre+this.price;
    }
    
    
}


