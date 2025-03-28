package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    private static int sequenser = 0;
    private int id;
    private String firstName;
    private String lastName;

    private List<Book> books = new ArrayList<>();


    public Person(String firstName, String lastName) {
        if(firstName == null || firstName.isEmpty()) throw new IllegalArgumentException("First name can't be null or empty");
        this.firstName = firstName;
        if(lastName == null || lastName.isEmpty()) throw new IllegalArgumentException("Last name can't be null or empty");
        this.lastName = lastName;

        this.id = getNextId();
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    private static int getNextId() {
        return ++sequenser;
    }

    public void loanBook(Book book) {
        this.books.add(book);
        System.out.printf("\n%s %s borrowed: %s by %s", this.firstName, this.lastName, book.getTitle(), book.getAuthor());
    }

    public void returnBook(Book book) {
        for (int i = 0; i <= books.size()-1; i++) {
            if(books.get(i).equals(book)) {
                books.remove(i);
                System.out.printf("The book, %s by %s was successfully returned from %s %s", book.getTitle(), book.getAuthor(), this.firstName, this.lastName);
                break;
            } else if(i == books.size()-1) {
                System.out.printf("\nSorry, %s %s has not borrowed the book, %s by %s that you want to return", this.firstName, this.lastName, book.getTitle(), book.getAuthor());
            }
        }
    }

    public void getAllLoanedBooks() {
        System.out.printf("\nAll loans made by %s %s:\n",getFirstName(), getLastName());
        for(Book book : books) {
            System.out.printf("- %s by %s\n", book.getTitle(), book.getAuthor());
        }
    }

    public String getPersonInformation() {
        return "\nname: " + getFirstName() + " " + getLastName() + "\nid: " + getId();
    }
}