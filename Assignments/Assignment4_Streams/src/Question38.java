import java.util.*;
import java.util.stream.Collectors;

public class Question38 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop A", "Electronics", 4.5),
                new Product("Laptop B", "Electronics", 4.7),
                new Product("Shampoo A", "Personal Care", 4.1),
                new Product("Shampoo B", "Personal Care", 4.3),
                new Product("T-shirt A", "Clothing", 3.9)
        );

        Map<String, String> highestRatedProductByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                optionalProduct -> optionalProduct.map(Product::getName).orElse(null)
                        )
                ));

        highestRatedProductByCategory.forEach((category, productName) ->
                System.out.println(category + " → " + productName)
        );
    }
}

class Product {
    String name;
    String category;
    double rating;

    public Product(String name, String category, double rating) {
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }
}
