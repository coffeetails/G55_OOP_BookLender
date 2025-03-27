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

    public Book(String title, String author, boolean borrowed) {
        this(title, author);
        this.available = !borrowed;
    }

    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
    }

    // Should have info on who has borrowed the book

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
        // id, title, author, available
        String isAvailable = "no";
        if(isAvailable()) {
            isAvailable = "yes";
        }
        return "\ntitle: " + getTitle() + "\nauthor: " + getAuthor() + "\navailable: " + isAvailable + "\nid: " + getId();
    }
}