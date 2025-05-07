import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question30 {

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", 250.0, "DELIVERED"),
                new Order("Bob", 180.0, "PENDING"),
                new Order("Charlie", 300.0, "DELIVERED"),
                new Order("Diana", 120.0, "CANCELLED")
        );

        // Pipeline: filter -> sort -> map
        List<String> customerNames = orders.stream()
                .filter(order -> order.getStatus().equals("DELIVERED"))
                .sorted(Comparator.comparingDouble(Order::getAmount))
                .map(Order::getCustomerName)
                .collect(Collectors.toList());

        System.out.println("Delivered orders (sorted): " + customerNames);
    }
}

class Order {
    private String customerName;
    private double amount;
    private String status;

    public Order(String customerName, double amount, String status) {
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
}
