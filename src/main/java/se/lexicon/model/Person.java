package se.lexicon.model;

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

    private List<Book> books;


    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        setId(getNextId());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    private static int getNextId() {
        return ++sequenser;
    }

    public void loanBook(Book book) {

    }

    public void returnBook(Book book) {

    }

    public String getPersonInformation() {
        return "\nname: " + getFirstName() + " " + getLastName() + "\nid: " + getId();
    }
}