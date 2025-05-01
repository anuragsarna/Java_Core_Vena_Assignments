package Question_5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Product> productMap = new TreeMap<>();

        productMap.put(101, new Product(101, "Laptop", 999.99, 4.5, 10));
        productMap.put(102, new Product(102, "Mouse", 19.99, 4.2, 50));
        productMap.put(103, new Product(103, "Keyboard", 49.99, 4.5, 30));
        productMap.put(104, new Product(104, "Monitor", 199.99, 4.8, 15));
        productMap.put(105, new Product(105, "Webcam", 39.99, 4.2, 20));


        List<Product> sortedProducts = new ArrayList<>(productMap.values());
        sortedProducts.sort((p1, p2) -> {
            int ratingCompare = Double.compare(p2.rating, p1.rating);
            if (ratingCompare != 0) return ratingCompare;
            return p1.name.compareTo(p2.name);
        });


        System.out.println("Products sorted by rating (desc) and name:");
        for (Product product : sortedProducts) {
            System.out.println(product);
        }
    }
}
