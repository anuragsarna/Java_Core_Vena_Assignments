package Question_6;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        catalog.addBook("Fantasy", new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 1954));
        catalog.addBook("Science Fiction", new Book("Dune", "Frank Herbert", 1965));
        catalog.addBook("Science Fiction", new Book("Neuromancer", "William Gibson", 1984));
        catalog.addBook("Science Fiction", new Book("Dune", "Frank Herbert", 1965)); // Duplicate

        catalog.printBooksByGenreSorted("Science Fiction");
        catalog.printBooksByGenreSorted("Fantasy");
        catalog.printBooksByGenreSorted("Mystery");
    }
}
