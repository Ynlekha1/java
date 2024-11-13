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
    
    public String getLibraryCode() {
        return libraryCode;
    }
    
    public String getSection() {
        return section;
    }
    
    public String getShelfNumber() {
        return shelfNumber;
    }
    
    public int getTotalCopies() {
        return totalCopies;
    }
    
    public int getAvailableCopies() {
        return availableCopies;
    }
    
    public String getBorrowerName() {
        return borrowerName;
    }
    
    public String getBorrowerId() {
        return borrowerId;
    }
    
    public int getBorrowDate() {
        return borrowDate;
    }
    
    public int getReturnDate() {
        return returnDate;
    }
    
    public double getFineAmount() {
        return fineAmount;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
    public boolean isReserved() {
        return isReserved;
    }
    
    public boolean isDigitalCopyAvailable() {
        return isDigitalCopyAvailable;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setEdition(int edition) {
        this.edition = edition;
    }
    
    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode;
    }
    
    public void setSection(String section) {
        this.section = section;
    }
    
    public void setShelfNumber(String shelfNumber) {
        this.shelfNumber = shelfNumber;
    }
    
    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }
    
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
    
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
    
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }
    
    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }
    
    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }
    
    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }
    
    public void setDigitalCopyAvailable(boolean isDigitalCopyAvailable) {
        this.isDigitalCopyAvailable = isDigitalCopyAvailable;
    }
}