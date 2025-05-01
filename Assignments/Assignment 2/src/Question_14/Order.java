package Question_14;

class Order {
    private static int idCounter = 1;
    private int orderId;
    private String item;

    public Order(String item) {
        this.orderId = idCounter++;
        this.item = item;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + ": " + item;
    }
}