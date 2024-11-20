package com.java.crud.Entity;

public class Book {
	 private String title;
	    private String author;
	    private int price;
	    private int pages;
	    private int stock;
	    
	    
	    
	    public Book(String title, String author, int price, int pages, int stock) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.pages = pages;
	        this.stock = stock;
	    }



		public String getTitle() {
			return title;
		}



		public void setTitle(String title) {
			this.title = title;
		}



		public String getAuthor() {
			return author;
		}



		public void setAuthor(String author) {
			this.author = author;
		}



		public int getPrice() {
			return price;
		}



		public void setPrice(int price) {
			this.price = price;
		}



		public int getPages() {
			return pages;
		}



		public void setPages(int pages) {
			this.pages = pages;
		}



		public int getStock() {
			return stock;
		}



		public void setStock(int stock) {
			this.stock = stock;
		}
	    
	    
	    
	    
	    
}
