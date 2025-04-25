package Question1_ClassAndObject;

// Library.java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Search for a book by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.printDetails();
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with that title.");
        }
    }
}
