package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Initialize and display Book & Person instances
        Book mockingbird = new Book("To Kill a Mockingbird", "Harper Lee");
        Book ninteeneightyfour = new Book("1984", "George Orwell", false);
        Book greatgatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", false);

        System.out.println(mockingbird.getBookInformation());
        System.out.println(ninteeneightyfour.getBookInformation());
        System.out.println(greatgatsby.getBookInformation());

        Person johnd = new Person("John", "Doe");
        Person jonnas = new Person("Jonna", "Smith");

        System.out.println(johnd.getPersonInformation());
        System.out.println(jonnas.getPersonInformation());

        System.out.println("==========");

        // Simulate borrowing a book
        johnd.loanBook(mockingbird);
        johnd.loanBook(greatgatsby);
        johnd.getAllLoanedBooks();

        System.out.println("==========");

        // Simulate returning a book
        johnd.returnBook(mockingbird);
        johnd.getAllLoanedBooks();

    }

}
