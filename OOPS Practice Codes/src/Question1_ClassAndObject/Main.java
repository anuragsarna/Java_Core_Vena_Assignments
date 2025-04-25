package Question1_ClassAndObject;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Theory Of Everything" , "Stephen Hawking" , 123456789);
        Book book2 = new Book("Cashflow Quadrant" , "Robert Kiyosaki" , 238167387);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.searchByTitle("Cashflow Quadrant");
    }
}
