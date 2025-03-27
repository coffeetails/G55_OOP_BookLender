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
        available = !borrowed;
    }

    public Book(String title, String author) {
        setId();
        setTitle(title);
        setAuthor(author);
    }

    // Should have info on who has borrowed the book

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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