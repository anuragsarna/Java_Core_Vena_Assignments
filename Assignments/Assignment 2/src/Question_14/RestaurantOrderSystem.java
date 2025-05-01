package Question_14;
import java.util.*;

public class RestaurantOrderSystem {
    private Deque<Order> currentOrders = new LinkedList<>();
    private List<Order> orderHistory = new ArrayList<>();

    // Add order to front (e.g., VIP or rush order)
    public void addOrderToFront(Order order) {
        currentOrders.addFirst(order);
        System.out.println("Added to front: " + order);
    }

    // Add order to back (e.g., normal order)
    public void addOrderToBack(Order order) {
        currentOrders.addLast(order);
        System.out.println("Added to back: " + order);
    }

    // Remove and complete order from front
    public void completeOrderFromFront() {
        if (!currentOrders.isEmpty()) {
            Order completed = currentOrders.removeFirst();
            orderHistory.add(completed);
            System.out.println("Completed from front: " + completed);
        } else {
            System.out.println("No orders to complete at front.");
        }
    }

    // Remove and complete order from back
    public void completeOrderFromBack() {
        if (!currentOrders.isEmpty()) {
            Order completed = currentOrders.removeLast();
            orderHistory.add(completed);
            System.out.println("Completed from back: " + completed);
        } else {
            System.out.println("No orders to complete at back.");
        }
    }

    // View current orders
    public void showCurrentOrders() {
        System.out.println("Current Orders:");
        for (Order order : currentOrders) {
            System.out.println(order);
        }
    }

    // View order history
    public void showOrderHistory() {
        System.out.println("Order History:");
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }
}