import java.util.*;
import java.util.stream.Collectors;

class Items {
    String name;
    double price;

    public Items(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Orders {
    List<Items> items;

    public Orders(List<Items> items) {
        this.items = items;
    }

    public List<Items> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Items::getPrice).sum();
    }
}

public class Question37 {
    public static void main(String[] args) {
        List<Orders> orders = Arrays.asList(
                new Orders(Arrays.asList(new Items("Apple", 1.0), new Items("Banana", 2.0))),
                new Orders(Arrays.asList(new Items("Orange", 3.0), new Items("Grapes", 5.0))),
                new Orders(Arrays.asList(new Items("Pineapple", 4.0)))
        );

        Orders Question37 = orders.stream()
                .max(Comparator.comparingDouble(Orders::getTotalPrice))
                .orElse(null);

        if (Question37 != null) {
            System.out.println("Order with highest total price:");
            System.out.println("Total price: " + Question37.getTotalPrice());
            Question37.getItems().forEach(item ->
                    System.out.println(item.getName() + ": " + item.getPrice())
            );
        } else {
            System.out.println("No orders available.");
        }
    }
}
