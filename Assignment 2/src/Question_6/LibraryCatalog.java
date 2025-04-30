package Question_6;

import java.util.*;

public class LibraryCatalog {
    private Map<String, Set<Book>> catalog;

    public LibraryCatalog() {
        catalog = new HashMap<>();
    }

    public void addBook(String genre, Book book) {
        catalog.computeIfAbsent(genre, g -> new HashSet<>()).add(book);
    }

    public void printBooksByGenreSorted(String genre) {
        Set<Book> books = catalog.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("No books found in genre: " + genre);
            return;
        }

        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getPublicationYear(), b2.getPublicationYear());
                // Sort by year
            }
        });

        System.out.println("------------------------------------");
        System.out.println("Books in genre: " + genre);
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}

