import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    double price;
    double rating;

    public Book(String title, double price, double rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

class Summary {
    private int totalCount;
    private double averageRating;
    private double totalPrice;

    public Summary(int totalCount, double averageRating, double totalPrice) {
        this.totalCount = totalCount;
        this.averageRating = averageRating;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "totalCount=" + totalCount +
                ", averageRating=" + averageRating +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

public class Question45 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book A", 20.5, 4.2),
                new Book("Book B", 15.3, 3.8),
                new Book("Book C", 25.0, 4.5),
                new Book("Book D", 10.0, 3.9)
        );

        Summary summary = generateSummary(books);
        System.out.println(summary);
    }

    public static Summary generateSummary(List<Book> books) {

        int totalCount = books.size();
        double averageRating = books.stream()
                .mapToDouble(Book::getRating)
                .average()
                .orElse(0.0);
        double totalPrice = books.stream()
                .mapToDouble(Book::getPrice)
                .sum();

        // Return the summary object
        return new Summary(totalCount, averageRating, totalPrice);
    }
}

