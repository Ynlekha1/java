package com.java.encapsulation;

public class LibraryBook {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int edition;
    
    private String libraryCode;
    private String section;
    private String shelfNumber;
    private int totalCopies;
    private int availableCopies;
    
    private String borrowerName;
    private String borrowerId;
    private int borrowDate;
    private int returnDate;
    private double fineAmount;
    
    private String language;
    private String genre;
    private int numberOfPages;
    private boolean isReserved;
    private boolean isDigitalCopyAvailable;

    
    public LibraryBook(String title, String author, String publisher, String isbn, int edition,
                       String libraryCode, String section, String shelfNumber, int totalCopies, int availableCopies,
                       String borrowerName, String borrowerId, int borrowDate, int returnDate, double fineAmount,
                       String language, String genre, int numberOfPages, boolean isReserved, boolean isDigitalCopyAvailable) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.edition = edition;
        this.libraryCode = libraryCode;
        this.section = section;
        this.shelfNumber = shelfNumber;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
        this.borrowerName = borrowerName;
        this.borrowerId = borrowerId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.fineAmount = fineAmount;
        this.language = language;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.isReserved = isReserved;
        this.isDigitalCopyAvailable = isDigitalCopyAvailable;
    }

    
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getEdition() {
        return edition;
    }
    
}
