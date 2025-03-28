package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Initialize and display Book & Person instances
        Book ninteeneightyfour = new Book("1984", "George Orwell");
        Book greatgatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        System.out.println(ninteeneightyfour.getBookInformation());
        System.out.println(greatgatsby.getBookInformation());

        Person johnd = new Person("John", "Doe");
        Person jonnas = new Person("Jonna", "Smith");

        System.out.println(johnd.getPersonInformation());
        System.out.println(jonnas.getPersonInformation());

        System.out.println("==========");

        // Simulate borrowing a book
        Book mockingbird = new Book("To Kill a Mockingbird", "Harper Lee", johnd);
        johnd.loanBook(greatgatsby);
        johnd.getAllLoanedBooks();

        System.out.println("==========");

        System.out.println(mockingbird.getBookInformation());

        System.out.println("==========");

        // Simulate returning a book
        johnd.returnBook(mockingbird);
        johnd.getAllLoanedBooks();

    }

}
