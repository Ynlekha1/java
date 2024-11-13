package com.java.encapsulation;

public class BookRunner {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Effective Java", "Joshua Bloch", "Addison-Wesley", "978-0134685991", 3,
                                           "LIB123", "Programming", "Shelf 5", 10, 5, "John Doe", "BR001", 
                                           20231112, 20231212, 0.0, "English", "Programming", 416, false, true);
        
        
        
        
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publisher: " + book.getPublisher());
        

    }
}
