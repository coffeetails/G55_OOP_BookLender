package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author, Person borrower) {
        if(title == null || title.isEmpty()) throw new IllegalArgumentException("Title can't be null or empty");
        this.title = title;
        if(author == null || author.isEmpty()) throw new IllegalArgumentException("Author can't be null or empty");
        this.author = author;

        this.id = UUID.randomUUID().toString();
        available = true;

        if(borrower != null) {
            this.borrower = borrower;
            borrower.loanBook(this);
            this.available = false;
        }
    }

    public Book(String title, String author) {
        this(title, author, null);
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getBookInformation() {
        String isAvailable = "Yes";
        if(!isAvailable()) {
            isAvailable = "No \nborrower: " + borrower.getFirstName() + " " + borrower.getLastName();
        }
        return "\ntitle: " + getTitle() + "\nauthor: " + getAuthor() + "\navailable: " + isAvailable + "\nid: " + getId();
    }
}