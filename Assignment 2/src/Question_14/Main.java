package Question_14;

public class Main {
    public static void main(String[] args) {
        RestaurantOrderSystem system = new RestaurantOrderSystem();

        system.addOrderToBack(new Order("Burger"));
        system.addOrderToBack(new Order("Pizza"));
        system.addOrderToFront(new Order("Salad"));

        system.showCurrentOrders();

        system.completeOrderFromFront();
        system.completeOrderFromBack();

        system.showCurrentOrders();
        system.showOrderHistory();
    }
}

